package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //substitui os getters e setters
@Entity
public class Localizacao {
    public Localizacao() {
        super();
    }

    public Localizacao(Long localizacao_id){
        this.localizacao_id = localizacao_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long localizacao_id;

    @Column(nullable=false)
    private String endereco;

    public Localizacao(Long localizacao_id, String endereco) {
        this.localizacao_id = localizacao_id;
        this.endereco = endereco;
    }
}
