package com.thesly.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesly.projeto.entities.SaidaProdutos;
import com.thesly.projeto.repositories.SaidaProdutosRepository;

@Service
public class SaidaProdutosService {

  @Autowired
  private SaidaProdutosRepository saidaProdutosRepository;

  public List<SaidaProdutos> pegarTodos(){
    return saidaProdutosRepository.findAll();
  }

  public Optional<SaidaProdutos> pegarPorId(Long id){
    return saidaProdutosRepository.findById(id);
  }

  public SaidaProdutos salvarSaida(SaidaProdutos saidaProdutos){
    return saidaProdutosRepository.save(saidaProdutos);
  }

}
