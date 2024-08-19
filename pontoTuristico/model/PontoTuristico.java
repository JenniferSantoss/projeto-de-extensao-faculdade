package model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity

public class PontoTuristico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    @ManyToOne
    private Localizacao localizacao;
    private Double custoMedio;
    @ManyToMany
    private Set<TipoAtividade> tiposAtividades = new HashSet<>();
    private String horarioFuncionamento;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private LocalDateTime dataAtualizacao;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public  
    Localizacao getLocalizacao() {
        return localizacao;
    }

    public  
    Double getCustoMedio() {
        return custoMedio;
    }

    public Set<TipoAtividade> getTiposAtividades() {
        return tiposAtividades;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public  
 void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public void setCustoMedio(Double  
 custoMedio) {
        this.custoMedio = custoMedio;
    }

    public void setTiposAtividades(Set<TipoAtividade> tiposAtividades) {
        this.tiposAtividades = tiposAtividades;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public void  
 setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao; 

    }
}