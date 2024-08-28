package com.web.estacio.pontos_turisticos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //substitui os getters e setters
@Entity
public class ClientesInteresse {
    public ClientesInteresse() {
        super();
    }

    public ClientesInteresse(Long clientesInteresse_id){
        this.clientesinteresse_id = clientesInteresse_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientesinteresse_id;

    private Long cliente_id;

    private Long interesse_id;

    @Column(nullable=false)
    private String nivel_interesse;

    public ClientesInteresse(Long clientesInteresse_id, Long cliente_id, Long interesse_id, String nivel_interesse) {
        this.clientesinteresse_id = clientesInteresse_id;
        this.cliente_id = cliente_id;
        this.interesse_id = interesse_id;
        this.nivel_interesse = nivel_interesse;
    }
}
