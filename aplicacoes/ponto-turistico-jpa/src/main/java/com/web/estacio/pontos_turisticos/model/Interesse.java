package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //substitui os getters e setters
@Entity
public class Interesse {
    public Interesse() {
        super();
    }

    public Interesse(Long interesse_id){
        this.interesse_id = interesse_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long interesse_id;

    @Column(nullable=false)
    private String descricao;

    public Interesse(Long interesse_id, String descricao) {
        this.interesse_id = interesse_id;
        this.descricao = descricao;
    }
}
