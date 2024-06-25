package com.thesly.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thesly.projeto.entities.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
  
}
