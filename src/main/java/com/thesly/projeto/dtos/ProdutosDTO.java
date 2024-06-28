package com.thesly.projeto.dtos;

import java.util.Date;

public class ProdutosDTO {
    private String nome;
    private String marca;
    private String tipoProduto;
    private String tamanho;
    private Integer quantidade;
    private Double valorUnidade;
    private Double valorLote;
    private Date fabricacao;
    private Date vencimento;

    // Construtor padrão
    public ProdutosDTO() {
    }

    // Construtor com parâmetros
    public ProdutosDTO(
        String nome,
        String marca,
        String tipoProduto,
        String tamanho,
        Integer quantidade,
        Double valorUnidade,
        Double valorLote,
        Date fabricacao,
        Date vencimento
    ) {
        this.nome = nome;
        this.marca = marca;
        this.tipoProduto = tipoProduto;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
        this.valorLote = valorLote;
        this.fabricacao = fabricacao;
        this.vencimento = vencimento;
    }

    // Getters e Setters
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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