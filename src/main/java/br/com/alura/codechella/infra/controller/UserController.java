package br.com.alura.codechella.infra.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.codechella.application.usecases.CreateUser;
import br.com.alura.codechella.domain.entity.user.User;
import br.com.alura.codechella.infra.dto.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {

	private final CreateUser createUser;

	public UserController(CreateUser createUser) {
		this.createUser = createUser;
	}
	
	@PostMapping
	public UserDto create(@RequestBody UserDto dto) {
		User saved = createUser.create(
			new User(dto.cpf(), dto.name(), dto.birth(), dto.email())
		);
		return new UserDto(saved.getCpf(), saved.getName(), saved.getBirth(), saved.getEmail());
	}
	
}
