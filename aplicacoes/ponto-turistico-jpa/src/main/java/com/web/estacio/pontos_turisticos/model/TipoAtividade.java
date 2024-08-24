package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //substitui os getters e setters
@Entity
public class TipoAtividade {
    public TipoAtividade() {
        super();
    }

    public TipoAtividade(Long tipoatividade_id){
        this.tipoatividade_id = tipoatividade_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tipoatividade_id;

    @Column(nullable=false)
    private String nome;

    public TipoAtividade(Long tipoatividade_id, String nome) {
        this.tipoatividade_id = tipoatividade_id;
        this.nome = nome;
    }
}
