package com.example.minha_loja_de_game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.minha_loja_de_game.model.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos , Long > {
	public List <Produtos> findAllByNomeContainingIgnoreCase(String nome);
}
