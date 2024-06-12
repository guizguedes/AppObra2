package com.AppObra.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;

import java.math.BigDecimal;


@Entity
@Table(name = "Obra")
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo")
    private long Codigo;

    @Column(name = "NomeDoProfissional")
    private String NomeDoProfissional;

    @Column(name = "CargoDoProfissional")
    private String CargoDoProfissional;

    @Column(name = "MaoDeObra")
    private BigDecimal MaoDeObra;

    @Column(name = "NomeDoMaterial")
    private String NomeDoMaterial;

    @Column(name = "ValorDoMaterial")
    private BigDecimal ValorDoMaterial;

    public String getNomeDoMaterial() {
        return NomeDoMaterial;
    }

    public void setNomeDoMaterial(String nomeDoMaterial) {
        NomeDoMaterial = nomeDoMaterial;
    }

    public BigDecimal getValorDoMaterial() {
        return ValorDoMaterial;
    }

    public void setValorDoMaterial(BigDecimal valorDoMaterial) {
        ValorDoMaterial = valorDoMaterial;
    }
//Get and Set

    public long getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNomeDoProfissional() {
        return NomeDoProfissional;
    }

    public void setNomeDoProfissional(String nomeDoProfissional) {
        NomeDoProfissional = nomeDoProfissional;
    }

    public String getCargoDoProfissional() {
        return CargoDoProfissional;
    }

    public void setCargoDoProfissional(String cargoDoProfissional) {
        CargoDoProfissional = cargoDoProfissional;
    }

    public BigDecimal getMaoDeObra() {
        return MaoDeObra;
    }

    public void setMaoDeObra(BigDecimal maoDeObra) {
        MaoDeObra = maoDeObra;
    }
}