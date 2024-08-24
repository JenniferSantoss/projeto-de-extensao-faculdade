package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Cliente {

    public Cliente() {
        super();
    }

    public Cliente(Long cliente_id){
        this.cliente_id = cliente_id;
    }

    public Cliente(Long cliente_id, String nome, String email, String genero, String profissao, String pais_origem, String idioma, String faixa_etaria, Double renda, String estado_civil, Integer frequencia_viagens, String tipo_viajant, String preferencia_acomodaca) {
        this.cliente_id = cliente_id;
        this.nome = nome;
        this.email = email;
        this.genero = genero;
        this.profissao = profissao;
        this.pais_origem = pais_origem;
        this.idioma = idioma;
        this.faixa_etaria = faixa_etaria;
        this.renda = renda;
        this.estado_civil = estado_civil;
        this.frequencia_viagens = frequencia_viagens;
        this.tipo_viajant = tipo_viajant;
        this.preferencia_acomodaca = preferencia_acomodaca;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cliente_id;

    @Column(nullable=false)
    private String nome;
    
    private String email;

   // data_nascimento DATE,

    private String genero;

    private String profissao;

    private String pais_origem;

    private String idioma;

    //data_cadastro TIMESTAMP DEFAULT NOW(),

    private String faixa_etaria;

    private Double renda;

    private String estado_civil;

    private Integer frequencia_viagens;

    private String tipo_viajant;

    private String preferencia_acomodaca;
}
