package com.thesly.projeto.mappers;

import com.thesly.projeto.dtos.ProdutosDTO;
import com.thesly.projeto.entities.Produtos;

public class ProdutosMapper {
  public static Produtos toEntity(ProdutosDTO produtosDTO){
    return new Produtos(
      produtosDTO.getNome(),
      produtosDTO.getMarca(),
      produtosDTO.getQuantidade(),
      produtosDTO.getTipoProduto(),
      produtosDTO.getTamanho(),
      produtosDTO.getValorUnidade(),
      produtosDTO.getValorLote(),
      produtosDTO.getFabricacao(),
      produtosDTO.getVencimento()
  );
  }
  public static ProdutosDTO toDTO(Produtos produtos){
    return new ProdutosDTO(
      produtos.getNome(),
      produtos.getMarca(),
      produtos.getTipoProduto(),
      produtos.getTamanho(),
      produtos.getQuantidade(),
      produtos.getValorUnidade(),
      produtos.getValorLote(),
      produtos.getFabricacao(),
      produtos.getVencimento()
    );
  }
}
