package com.thesly.projeto.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class SaidaProdutos extends Produtos {

  @Column(name = "quant_saida_prod",nullable = false)
  private Integer quantidadeProdutos;

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

    Integer quantidadeProdutos,
    Date saida,
    String tipoProduto,
    String tamanho,
    String nome,
    String marca,
    Integer quantidade,
    Double valorUnidade,
    Double valorLote,
    Date fabricacao,
    Date vencimento

  ){
    super(
      nome,
      marca,
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
  public void setQuantidadeProdutos(Integer quantidadeProdutos) {
    this.quantidadeProdutos = quantidadeProdutos;
  }
  public Integer getQuantidadeProdutos() {
    return quantidadeProdutos;
  }

}

