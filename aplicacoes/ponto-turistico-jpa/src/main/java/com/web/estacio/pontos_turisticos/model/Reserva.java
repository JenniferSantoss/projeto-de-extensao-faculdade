package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //substitui os getters e setters
@Entity
public class Reserva {
    public Reserva() {
        super();
    }

    public Reserva(Long reserva_id){
        this.reserva_id = reserva_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reserva_id;

    private Long cliente_id;

    private Long ponto_turistico_id;

    private Long acomodacao_id;

    @Column(nullable=false)
    private String data_checkin;

    private String data_checkout;

    private float valor_total;

    private String agencia_de_viagens;

    private String canal_de_venda;

    public Reserva(Long reserva_id, Long cliente_id, Long ponto_turistico_id, Long acomodacao_id, String data_checkin, String data_checkout, float valor_total, String agencia_de_viagens, String canal_de_venda) {
        this.reserva_id = reserva_id;
        this.cliente_id = cliente_id;
        this.ponto_turistico_id = ponto_turistico_id;
        this.acomodacao_id = acomodacao_id;
        this.data_checkin = data_checkin;
        this.data_checkout = data_checkout;
        this.valor_total = valor_total;
        this.agencia_de_viagens = agencia_de_viagens;
        this.canal_de_venda = canal_de_venda;
    }
}

