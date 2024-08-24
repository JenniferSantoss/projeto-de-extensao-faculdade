package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //substitui os getters e setters
@Entity
public class Destino {
    public Destino() {
        super();
    }

    public Destino(Long destino_id){
        this.destino_id = destino_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destino_id;

    @Column(nullable=false)
    private String nome;

    private String pais;

    private String cidade;

    private String descricao;

    private String clima;

    private int custo_medio_dia;

    private String categoria_destino;

    private String seguranca;

    private String facilidade_acesso;

    private String infraestrutura_turistica;

    private String localizacao_id;

    public Destino(String localizacao_id, String infraestrutura_turistica, String facilidade_acesso, String seguranca, String categoria_destino, int custo_medio_dia, String clima, String descricao, String cidade, String pais, String nome, Long destino_id) {
        this.localizacao_id = localizacao_id;
        this.infraestrutura_turistica = infraestrutura_turistica;
        this.facilidade_acesso = facilidade_acesso;
        this.seguranca = seguranca;
        this.categoria_destino = categoria_destino;
        this.custo_medio_dia = custo_medio_dia;
        this.clima = clima;
        this.descricao = descricao;
        this.cidade = cidade;
        this.pais = pais;
        this.nome = nome;
        this.destino_id = destino_id;
    }
}
