package br.com.alura.codechella.nottouse.service;

import java.util.List;

import br.com.alura.codechella.infra.persistence.UserEntity;

public interface UsuarioService {
    UserEntity cadastrarUsuario(UserEntity usuario);

    List<UserEntity> listarTodos();
}
