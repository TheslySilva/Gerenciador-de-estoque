package com.thesly.projeto.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Produtos{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "tipo", nullable = false)
    private String tipoProduto;

    @Column(name = "tamanho", nullable = false)
    private String tamanho;

    @Column(name = "quantidade",nullable = false)
    private Integer quantidade;

    @Column(name = "valor_unidade",nullable = false)
    private Double valorUnidade;

    @Column(name = "valor_lote", nullable = false)
    private Double valorLote;

    @Column(name = "fabricacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fabricacao;

    @Column(name = "vencimento",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date vencimento;

    // Construtores
    public Produtos() {
    }

    public Produtos( 
      String nome,
      String marca,
      Integer quantidade,
      String tipoProduto,
      String tamanho,
      Double valorUnidade, 
      Double valorLote, 
      Date fabricacao,
      Date vencimento
      ) {
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.tipoProduto = tipoProduto;
        this.tamanho = tamanho;
        this.valorUnidade = valorUnidade;
        this.valorLote = valorLote;
        this.fabricacao = fabricacao;
        this.vencimento = vencimento;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public String getMarca() {
    return marca;
    }

    public void setMarca(String marca) {
    this.marca = marca;
    }

    public String getTipoProduto() {
    return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
    this.tipoProduto = tipoProduto;
    }

    public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
    }

    public String getTamanho() {
    return tamanho;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(Double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public Double getValorLote() {
        return valorLote;
    }

    public void setValorLote(Double valorLote) {
        this.valorLote = valorLote;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
}
