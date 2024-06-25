package com.thesly.projeto.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thesly.projeto.entities.Produtos;
import com.thesly.projeto.services.ProdutosServices;

@RestController
@RequestMapping("/produtos")
public class ProdutosController{

 @Autowired
 private ProdutosServices produtosService; 
  
  @GetMapping
  public List<Produtos> pegarTodosProdutos(){
    return produtosService.pegarTodos();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Produtos> pegarPorId(@PathVariable Long id){

    Optional<Produtos> produto = produtosService.pegarPorId(id);

    return produto.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
  }

  @PostMapping
  public Produtos criarProduto(@RequestBody Produtos produtos){
    return produtosService.salvarProduto(produtos);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Produtos> atualizarProdutos(@PathVariable Long id, @RequestBody Produtos detalhesProduto){

    Optional <Produtos> produtoOpcional = produtosService.pegarPorId(id);

    if (produtoOpcional.isPresent()) {
      Produtos produto = produtoOpcional.get();

      produto.setNome(detalhesProduto.getNome());
      produto.setQuantidade(detalhesProduto.getQuantidade());
      produto.setValorUnidade(detalhesProduto.getValorUnidade());
      produto.setValorLote(detalhesProduto.getValorLote());
      produto.setFabricacao(detalhesProduto.getFabricacao());
      produto.setVencimento(detalhesProduto.getVencimento());

      return ResponseEntity.ok(produtosService.salvarProduto(produto));
    }else{
      return ResponseEntity.notFound().build();
    }

  }
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletarProduto(@PathVariable Long id){
    Optional<Produtos> produto = produtosService.pegarPorId(id);

    if (produto.isPresent()) {
      produtosService.deletarProduto(id);

      return ResponseEntity.noContent().build();
    }else{
      return ResponseEntity.notFound().build();
    }
  }
}
