package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //substitui os getters e setters
@Entity
public class ReservaMeioTransporte {
    public ReservaMeioTransporte() {
        super();
    }

    public ReservaMeioTransporte(Long reservameiotransporte_id){
        this.reservameiotransporte_id = reservameiotransporte_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservameiotransporte_id;

    @Column(nullable=false)
    private Long meio_transporte_id;

    public ReservaMeioTransporte(Long reservameiotransporte_id, Long meio_transporte_id) {
        this.reservameiotransporte_id = reservameiotransporte_id;
        this.meio_transporte_id = meio_transporte_id;
    }
}
