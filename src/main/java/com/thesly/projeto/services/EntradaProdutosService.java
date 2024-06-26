package com.thesly.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesly.projeto.entities.EntradaProdutos;
import com.thesly.projeto.repositories.EntradaProdutosRepository;

@Service
public class EntradaProdutosService {

  @Autowired
  private EntradaProdutosRepository entradaProdutosRepository;

  public List<EntradaProdutos> pegarTodos(){
    return entradaProdutosRepository.findAll();
  }

  public Optional<EntradaProdutos> pegarPorId(Long id){
    return entradaProdutosRepository.findById(id);
  }

  public EntradaProdutos salvarEntrada(EntradaProdutos entradaProdutos){
    return entradaProdutosRepository.save(entradaProdutos);
  }
}

