package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //substitui os getters e setters
@Entity
public class MeioTransporte {
    public MeioTransporte() {
        super();
    }

    public MeioTransporte(Long meiotransporte_id){
        this.meiotransporte_id = meiotransporte_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long meiotransporte_id;

    @Column(nullable=false)
    private String nome;

    private String tipo;

    public MeioTransporte(Long meiotransporte_id, String nome, String tipo) {
        this.meiotransporte_id = meiotransporte_id;
        this.nome = nome;
        this.tipo = tipo;
    }
}
