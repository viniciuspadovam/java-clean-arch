package br.com.alura.codechella.nottouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.codechella.infra.persistence.UserEntity;
import br.com.alura.codechella.nottouse.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserEntity cadastrarUsuario(UserEntity usuario) {
        return repository.save(usuario);
    }

    @Override
    public List<UserEntity> listarTodos() {
        return repository.findAll();
    }
}
