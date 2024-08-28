package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //substitui os getters e setters
@Entity
public class CompanhiaAerea {
    public CompanhiaAerea() {
        super();
    }

    public CompanhiaAerea(Long companhiaaerea_id){
        this.companhiaaerea_id = companhiaaerea_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companhiaaerea_id;

    @Column(nullable=false)
    private String nome;

    private String pais_origem;

    public CompanhiaAerea(String pais_origem, String nome, Long companhiaaerea_id) {
        this.pais_origem = pais_origem;
        this.nome = nome;
        this.companhiaaerea_id = companhiaaerea_id;
    }
}
