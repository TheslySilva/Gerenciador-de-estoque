package com.thesly.projeto.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thesly.projeto.entities.EntradaProdutos;
import com.thesly.projeto.services.EntradaProdutosService;

@RestController
@RequestMapping("/entrada")
public class EntradaProdutosController {
  
  @Autowired
  private EntradaProdutosService entradaProdutosService;

  @GetMapping
  private List<EntradaProdutos> pegarTodos(){
    return entradaProdutosService.pegarTodos();
  }

  @GetMapping("/{id}")
  public ResponseEntity<EntradaProdutos> pegarPorId(@PathVariable Long id){
   Optional <EntradaProdutos> entrada = entradaProdutosService.pegarPorId(id);

    return entrada.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
  }

  @PostMapping
  public EntradaProdutos adicionarProduto(@RequestBody EntradaProdutos entradaProdutos){

    return entradaProdutosService.salvarEntrada(entradaProdutos);
  }
}
