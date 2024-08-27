package com.web.estacio.pontos_turisticos.dao;

import jakarta.persistence.EntityManager;

import java.util.List;

public interface GenericJPADAO<T> {

    EntityManager getEntityManager();

    void closeEntityManager();

    void beginTransaction();

    void commit();

    void rollback();

    void save(T entity);

    void delete(T entity);
    T find(Object id);

    List<T> find();


}
