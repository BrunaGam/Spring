package com.example.minha_loja_de_game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.minha_loja_de_game.model.CategoriaModel;

@Repository
public interface CategoriaRepository  extends JpaRepository<CategoriaModel , Long > {
	public List <CategoriaModel> findAllByDescricaoContainingIgnoreCase(String descricao);
}
