package com.thesly.projeto.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class SaidaProdutos extends Produtos {

  @Column(name = "quant_saida_prod",nullable = false)
  private int quantidadeProdutos;

  @Column(name = "saida_produtos", nullable = false)
  @Temporal(TemporalType.DATE)
  private Date saida;

  //
  //Construtores
  //

  public SaidaProdutos(){
    super();
  }

  public SaidaProdutos(

    int quantidadeProdutos,
    Date saida,
    String tipoProduto,
    int tamanho,
    String nome,
    int quantidade,
    double valorUnidade,
    double valorLote,
    Date fabricacao,
    Date vencimento

  ){
    super(
      nome,
      quantidade,
      tipoProduto,
      tamanho,
      valorUnidade,
      valorLote,
      fabricacao,
      vencimento
    );

    this.quantidadeProdutos = quantidadeProdutos;
    this.saida = saida;
  }

  //
  //Getters e Setters
  //

  public Date getSaida() {
    return saida;
  }
  public void setQuantidadeProdutos(int quantidadeProdutos) {
    this.quantidadeProdutos = quantidadeProdutos;
  }
  public int getQuantidadeProdutos() {
    return quantidadeProdutos;
  }

}

