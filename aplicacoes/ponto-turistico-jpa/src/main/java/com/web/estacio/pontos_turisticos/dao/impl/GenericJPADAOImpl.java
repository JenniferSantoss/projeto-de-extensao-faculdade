package com.web.estacio.pontos_turisticos.dao.impl;

import com.web.estacio.pontos_turisticos.configuration.Config;
import com.web.estacio.pontos_turisticos.dao.GenericJPADAO;
import com.web.estacio.pontos_turisticos.exception.DAOException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.Properties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenericJPADAOImpl<T> implements GenericJPADAO<T> {


    private static final EntityManagerFactory emf;

    private static ThreadLocal<EntityManager>  ems = new ThreadLocal<EntityManager>();

    static {
        Properties props = Config.getConfig();
        String persistenceUnit = props.getProperty("persistence.unit");
        log.info("persistence.unit: {}", persistenceUnit);
        emf = Persistence.createEntityManagerFactory(persistenceUnit);
    }


    protected Class<T> persistentClass;

    public GenericJPADAOImpl() {}

    public GenericJPADAOImpl(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }


    @Override
    public EntityManager getEntityManager() {
        EntityManager em = ems.get();
        if (em == null) {
            em = emf.createEntityManager();
            ems.set(em);
        }
        return em;
    }

    /**
     *  Fecha o EntityManager atrelado à  Thread atual e retira-o da ThreadLocal.
     */
    @Override
    public void closeEntityManager() {
        EntityManager em = ems.get();
        if (em != null) {
            EntityTransaction tx = em.getTransaction();
            if (tx.isActive()) {
                tx.commit();
            }
            em.close();
            ems.set(null);
        }
    }

    @Override
    public void beginTransaction() {
        getEntityManager().getTransaction().begin();
    }

    @Override
    public void commit() {
        EntityTransaction tx = getEntityManager().getTransaction();
        if (tx.isActive()) {
            tx.commit();
        }
    }

    @Override
    public void rollback() {
        EntityTransaction tx = getEntityManager().getTransaction();
        if (tx.isActive()) {
            tx.rollback();
        }
    }




    @Override
    public void save(T entity) {
        EntityManager em = getEntityManager();
        try {
            beginTransaction();
            em.merge(entity);
            commit();
        } catch (Exception e) {
            rollback();
            throw new DAOException("ERRO: Não foi possível realizar a operação.", e);
        } finally {
            closeEntityManager();
        }
    }

    @Override
    public void delete(T entity) {
        EntityManager em = getEntityManager();
        try {
            beginTransaction();
            em.remove(em.merge(entity));
            commit();
        } catch (Exception e) {
            rollback();
            throw new DAOException("ERRO: Não foi possível realizar a operação.", e);
        } finally {
            closeEntityManager();
        }
    }

    @Override
    public T find(Object id) {
        return getEntityManager().find(persistentClass, id);
    }

    @Override
    public List<T> find() {
        CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder().createQuery(persistentClass);
        cq.from(persistentClass);
        return getEntityManager().createQuery(cq).getResultList();
    }


}

