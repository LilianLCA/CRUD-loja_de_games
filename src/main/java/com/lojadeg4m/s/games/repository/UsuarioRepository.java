package com.lojadeg4m.s.games.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadeg4m.s.games.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);
}
