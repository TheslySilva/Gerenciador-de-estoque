package com.thesly.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thesly.projeto.entities.EntradaProdutos;

@Repository
public interface EntradaProdutosRepository extends JpaRepository<EntradaProdutos, Long > {
  
}
