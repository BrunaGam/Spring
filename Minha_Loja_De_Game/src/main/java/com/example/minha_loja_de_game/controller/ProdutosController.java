package com.example.minha_loja_de_game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.minha_loja_de_game.model.Produtos;
import com.example.minha_loja_de_game.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutosController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity <List<Produtos>> getAll(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> getById(@PathVariable long id){
		return produtoRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	
	@GetMapping("/Nome/{Nome}")
	public ResponseEntity<List<Produtos>> getByNome(@PathVariable String Nome){
		return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(Nome));
	}
	
	@PostMapping
	public ResponseEntity<Produtos> postPostagens(@RequestBody Produtos produtos){
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produtos));
	}
	
	@PutMapping
	public ResponseEntity<Produtos> putPostagens(@RequestBody Produtos postagens){
		return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(postagens));
	}
	
	@DeleteMapping
	public void deleteProdutos(@PathVariable long id) {
		produtoRepository.deleteById(id);
	}

}
