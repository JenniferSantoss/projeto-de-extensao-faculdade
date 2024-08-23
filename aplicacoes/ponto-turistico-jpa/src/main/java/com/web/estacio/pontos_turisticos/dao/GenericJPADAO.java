package com.web.estacio.pontos_turisticos.dao;

import java.util.List;

public interface GenericJPADAO {
    public void save(T entity);
    public void delete(T entity);
    public T find(Object id);
    public List<T> find();
    public void beginTransaction();
    public void commit();
    public void rollback();
    public void close();
}
