package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //substitui os getters e setters
@Entity
public class Atividade {
    public Atividade() {
        super();
    }

    public Atividade(Long atividade_id){
        this.atividade_id = atividade_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atividade_id;

    @Column(nullable=false)
    private String nome;

    private String descricao;

    private Long tipo_atividade_id;

    private Long localizacao_id;

    public Atividade(Long localizacao_id, Long tipo_atividade_id, String descricao, String nome, Long atividade_id) {
        this.localizacao_id = localizacao_id;
        this.tipo_atividade_id = tipo_atividade_id;
        this.descricao = descricao;
        this.nome = nome;
        this.atividade_id = atividade_id;
    }
}
