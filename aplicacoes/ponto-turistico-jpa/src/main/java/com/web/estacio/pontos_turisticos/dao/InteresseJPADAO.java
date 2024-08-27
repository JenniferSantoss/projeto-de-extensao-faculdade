package com.web.estacio.pontos_turisticos.dao;

import com.web.estacio.pontos_turisticos.model.Interesse;

import java.util.List;

public interface InteresseJPADAO extends GenericJPADAO<Interesse> {

    void save(Interesse interesse);

    void delete(Long id);

    Interesse find(Long id);

    List<Interesse> find();

}
