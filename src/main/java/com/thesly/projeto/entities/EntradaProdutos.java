package com.thesly.projeto.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class EntradaProdutos extends Produtos {

  @Column(name = "quant_entrada_prod", nullable = false)
  private int quantidadeProdutos;

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
    int quantidadeProdutos,
    Date entrada,
    String nome,
    int quantidade,
    String tipoProduto,
    int tamanho,
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
    this.entrada = entrada;
  }

  //
  //Getters e Setters
  //

  public void setQuantidadeProdutos(int quantidadeProdutos) {
    this.quantidadeProdutos = quantidadeProdutos;
  }
  public int getQuantidadeProdutos() {
    return quantidadeProdutos;
  }
  public Date getEntrada() {
    return entrada;
  }

}
