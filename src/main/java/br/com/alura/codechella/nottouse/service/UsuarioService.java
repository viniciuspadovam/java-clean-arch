package br.com.alura.codechella.nottouse.service;

import java.util.List;

import br.com.alura.codechella.nottouse.model.Usuario;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
