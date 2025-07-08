package br.com.alura.codechella.nottouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.codechella.nottouse.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
