package br.com.alura.codechella.infra.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.codechella.application.usecases.CreateUser;
import br.com.alura.codechella.application.usecases.ListUsers;
import br.com.alura.codechella.domain.entity.user.User;
import br.com.alura.codechella.infra.dto.UserDto;

@RestController
@RequestMapping("/users")
public class UserController {

	private final CreateUser createUser;
	private final ListUsers listUsers;

	public UserController(CreateUser createUser, ListUsers listUsers) {
		this.createUser = createUser;
		this.listUsers = listUsers;
	}
	
	@GetMapping
	public List<UserDto> listAll() {
		return listUsers.listAll().stream()
				.map(user -> 
					new UserDto(user.getCpf(), user.getName(), user.getBirth(), user.getEmail()))
				.toList();
	}
	
	@PostMapping
	public UserDto create(@RequestBody UserDto dto) {
		User saved = createUser.create(
			new User(dto.cpf(), dto.name(), dto.birth(), dto.email())
		);
		return new UserDto(saved.getCpf(), saved.getName(), saved.getBirth(), saved.getEmail());
	}
	
}
