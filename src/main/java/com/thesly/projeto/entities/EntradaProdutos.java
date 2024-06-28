package com.thesly.projeto.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class EntradaProdutos extends Produtos {

  @Column(name = "quant_produtos", nullable = false)
  private Integer quantidadeProdutos;

  @Column(name = "entrada_produtos", nullable = false)
  @Temporal(TemporalType.DATE)
  private Date entrada;

  //
  //Construtores
  //

  public EntradaProdutos(){
    super();
  }

  public EntradaProdutos(
    Integer quantidadeProdutos,
    Date entrada,
    String nome,
    String marca,
    Integer quantidade,
    String tipoProduto,
    String tamanho,
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
    this.entrada = entrada;
  }

  //
  //Getters e Setters
  //

  public void setQuantidadeProdutos(Integer quantidadeProdutos) {
    this.quantidadeProdutos = quantidadeProdutos;
  }
  public Integer getQuantidadeProdutos() {
    return quantidadeProdutos;
  }
  public Date getEntrada() {
    return entrada;
  }

}
