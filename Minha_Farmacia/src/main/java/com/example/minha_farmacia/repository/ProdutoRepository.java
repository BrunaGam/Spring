package com.example.minha_farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.minha_farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto , Long > {
	public List <Produto> findAllByNomeContainingIgnoreCase(String nome);
}
