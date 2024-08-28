package com.web.estacio.pontos_turisticos.dao.impl;

import com.web.estacio.pontos_turisticos.dao.InteresseJPADAO;
import com.web.estacio.pontos_turisticos.model.Interesse;

public class InteresseJPADAOImpl extends GenericJPADAOImpl<Interesse> implements InteresseJPADAO {


    public InteresseJPADAOImpl() {
        super(Interesse.class);
    }

    @Override
    public void delete(Long interesseId) {
       delete(new Interesse(interesseId));
    }

    @Override
    public Interesse find(Long interesseId) {
        return find(interesseId);
    }
}
