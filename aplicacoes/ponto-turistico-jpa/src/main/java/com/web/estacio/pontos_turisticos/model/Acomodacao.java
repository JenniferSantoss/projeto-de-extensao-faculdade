package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Acomodacao {

    public Acomodacao() {
        super();
    }
    public Acomodacao(Long acomodacao_id){
        this.acomodacao_id = acomodacao_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long acomodacao_id;

    @Column(nullable=false)
    private String nome;

    private String descricao;

    private String estrelas;

    private String preco_por_noite;

    private Long localizacao_id;

    public Acomodacao(Long acomodacao_id, String nome, String descricao, String estrelas, String preco_por_noite, Long localizacao_id) {
        this.acomodacao_id = acomodacao_id;
        this.nome = nome;
        this.descricao = descricao;
        this.estrelas = estrelas;
        this.preco_por_noite = preco_por_noite;
        this.localizacao_id = localizacao_id;
    }
}
