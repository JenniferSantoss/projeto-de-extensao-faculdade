package com.web.estacio.pontos_turisticos.dao;

import com.web.estacio.pontos_turisticos.model.Cliente;

import java.util.List;

public interface ClienteJPADAO {

    void save(Cliente cliente);

    void delete(Long id);

    Cliente find(Long id);

    List<Cliente> find();

    Cliente findByCpf(String cpf);

    List<Cliente> findByNome(String str);
}
