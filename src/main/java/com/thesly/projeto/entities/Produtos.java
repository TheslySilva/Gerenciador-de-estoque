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
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "tipo_produto", nullable = false)
    private String tipoProduto;

    @Column(name = "tamanho", nullable = false)
    private int tamanho;

    @Column(name = "quantidade",nullable = false)
    private int quantidade;

    @Column(name = "valor_unidade",nullable = false)
    private double valorUnidade;

    @Column(name = "valor_lote", nullable = false)
    private double valorLote;

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
      int quantidade,
      String tipoProduto,
      int tamanho,
      double valorUnidade, 
      double valorLote, 
      Date fabricacao,
      Date vencimento
      ) {
        this.nome = nome;
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

    public String getTipoProduto() {
    return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
    this.tipoProduto = tipoProduto;
    }

    public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
    }

    public int getTamanho() {
    return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public double getValorLote() {
        return valorLote;
    }

    public void setValorLote(double valorLote) {
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
