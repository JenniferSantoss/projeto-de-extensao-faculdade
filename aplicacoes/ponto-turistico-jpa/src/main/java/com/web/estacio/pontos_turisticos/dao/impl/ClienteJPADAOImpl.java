package com.web.estacio.pontos_turisticos.dao.impl;

import com.web.estacio.pontos_turisticos.dao.ClienteJPADAO;
import com.web.estacio.pontos_turisticos.model.Cliente;

import java.util.List;

public class ClienteJPADAOImpl extends GenericJPADAOImpl<Cliente> implements ClienteJPADAO {

    public ClienteJPADAOImpl(){
        super(Cliente.class);
    }





    @Override
    public void delete(Long client_id) {
        delete(new Cliente(client_id));
    }


    @Override
    public Cliente find(int id) {
        return null;
    }

    @Override
    public List<Cliente> find() {
        return List.of();
    }

    @Override
    public Cliente findByCpf(String cpf) {
        return null;
    }

    @Override
    public List<Cliente> findByNome(String str) {
        return List.of();
    }
}
