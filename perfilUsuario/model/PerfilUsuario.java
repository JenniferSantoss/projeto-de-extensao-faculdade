package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PerfilUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer idade;
    @ManyToMany
    private Set<TipoAtividade> preferenciasAtividades = new HashSet<>();
    @ManyToMany
    private Set<Localizacao> preferenciasLocais = new HashSet<>();
    private Double gastoMaximo;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Set<TipoAtividade> getPreferenciasAtividades() {
        return preferenciasAtividades;
    }

    public Set<Localizacao> getPreferenciasLocais() {
        return preferenciasLocais;
    }

    public Double getGastoMaximo() {
        return gastoMaximo;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setPreferenciasAtividades(Set<TipoAtividade> preferenciasAtividades) {
        this.preferenciasAtividades = preferenciasAtividades;
    }

    public void setPreferenciasLocais(Set<Localizacao> preferenciasLocais) {
        this.preferenciasLocais = preferenciasLocais;
    }

    public void setGastoMaximo(Double gastoMaximo) {
        this.gastoMaximo = gastoMaximo;
    }
}