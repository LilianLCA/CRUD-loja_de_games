package com.lojadeg4m.s.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojadeg4m.s.games.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List <Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
