package com.thesly.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesly.projeto.repositories.ProdutosRepository;
import com.thesly.projeto.entities.Produtos;

@Service
public class ProdutosServices {

  @Autowired
  private ProdutosRepository produtosRepository;

  public List<Produtos> pegarTodos(){
    return produtosRepository.findAll();
  }

  public Optional <Produtos> pegarPorId(Long id){
    return produtosRepository.findById(id);
  }

  public Produtos salvarProduto(Produtos produtos){

    return produtosRepository.save(produtos);
  }

  public void deletarProduto(Long id){
    produtosRepository.deleteById(id);
  }

}
