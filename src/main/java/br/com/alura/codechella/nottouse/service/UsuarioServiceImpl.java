package br.com.alura.codechella.nottouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.codechella.nottouse.model.Usuario;
import br.com.alura.codechella.nottouse.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }
}
