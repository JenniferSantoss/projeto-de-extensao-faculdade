package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data //substitui os getters e setters
@Entity
public class Avaliacao {
    public Avaliacao() {
        super();
    }

    public Avaliacao(Long avaliacao_id){
        this.avaliacao_id = avaliacao_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long avaliacao_id;

    private Long cliente_id;

    private Long ponto_turistico_id;

    private Long acomodacao_id;

    @Column(nullable=false)
    private String comentario;

    private int nota;

    private LocalDate data_avaliacao;

    private String tipo_avaliacao;

    public Avaliacao(String tipo_avaliacao, LocalDate data_avaliacao, int nota, String comentario, Long acomodacao_id, Long ponto_turistico_id, Long cliente_id, Long avaliacao_id) {
        this.tipo_avaliacao = tipo_avaliacao;
        this.data_avaliacao = data_avaliacao;
        this.nota = nota;
        this.comentario = comentario;
        this.acomodacao_id = acomodacao_id;
        this.ponto_turistico_id = ponto_turistico_id;
        this.cliente_id = cliente_id;
        this.avaliacao_id = avaliacao_id;
    }
}
