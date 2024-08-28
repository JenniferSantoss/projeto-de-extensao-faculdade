package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //substitui os getters e setters
@Entity
public class ReservaCompanhiaAerea {
    public ReservaCompanhiaAerea() {
        super();
    }

    public ReservaCompanhiaAerea(Long reservacompanhiaaerea_id){
        this.reservacompanhiaaerea_id = reservacompanhiaaerea_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservacompanhiaaerea_id;

    @Column(nullable=false)
    private Long companhia_aerea_id;

    public ReservaCompanhiaAerea(Long reservacompanhiaaerea_id, Long companhia_aerea_id) {
        this.reservacompanhiaaerea_id = reservacompanhiaaerea_id;
        this.companhia_aerea_id = companhia_aerea_id;
    }
}
