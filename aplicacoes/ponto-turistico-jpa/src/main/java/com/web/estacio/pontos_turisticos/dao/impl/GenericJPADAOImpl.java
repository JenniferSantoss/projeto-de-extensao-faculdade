package com.web.estacio.pontos_turisticos.dao.impl;

import com.web.estacio.pontos_turisticos.dao.GenericJPADAO;
import com.web.estacio.pontos_turisticos.exception.DAOException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;

public class GenericJPADAOImpl<T> implements GenericJPADAO<T> {

        protected Class<T> persistentClass;

        public GenericJPADAOImpl() {}

        public GenericJPADAOImpl(Class<T> persistentClass) {
            this.persistentClass = persistentClass;
        }

        public void save(T entity) {
            EntityManager em = JPAUtilImpl.getEntityManager();
            try {
                JPAUtilImpl.beginTransaction();
                em.merge(entity);
                JPAUtilImpl.commit();
            } catch (Exception e) {
                JPAUtilImpl.rollback();
                throw new DAOException("ERRO: Não foi possível realizar a operação.", e);
            } finally {
                JPAUtilImpl.closeEntityManager();
            }
        }

        public void delete(T entity) {
            EntityManager em = JPAUtilImpl.getEntityManager();
            try {
                JPAUtilImpl.beginTransaction();
                em.remove(em.merge(entity));
                JPAUtilImpl.commit();
            } catch (Exception e) {
                JPAUtilImpl.rollback();
                throw new DAOException("ERRO: Não foi possível realizar a operação.", e);
            } finally {
                JPAUtilImpl.closeEntityManager();
            }
        }

        public T find(Object id) {
            return getEm().find(persistentClass, id);
        }

        public List<T> find() {
            CriteriaQuery<T> cq = getEm().getCriteriaBuilder().createQuery(persistentClass);
            cq.from(persistentClass);
            return getEm().createQuery(cq).getResultList();
        }

        public EntityManager getEm() {
            return JPAUtilImpl.getEntityManager();
        }

        public void beginTransaction() {
            JPAUtilImpl.beginTransaction();
        }

        public void commit() {
            JPAUtilImpl.commit();
        }

        public void rollback() {
            JPAUtilImpl.rollback();
        }

        public void close() {
            JPAUtilImpl.closeEntityManager();
        }

    }
}
