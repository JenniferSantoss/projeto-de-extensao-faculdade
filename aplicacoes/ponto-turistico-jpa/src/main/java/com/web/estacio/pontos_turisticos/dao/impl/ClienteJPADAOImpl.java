package com.web.estacio.pontos_turisticos.dao.impl;

import com.web.estacio.pontos_turisticos.dao.ClienteJPADAO;
import com.web.estacio.pontos_turisticos.model.Cliente;

import java.util.List;

public class ClienteJPADAOImpl extends GenericJPADAOImpl<Cliente> implements ClienteJPADAO {


    @Override
    public void delete(Long cliente_id) {
          delete(new Cliente(cliente_id));
    }

    @Override
    public Cliente find(Long cliente_id) {
        return find(cliente_id);
    }
}
