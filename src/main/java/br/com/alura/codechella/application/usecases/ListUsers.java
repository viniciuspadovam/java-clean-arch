package br.com.alura.codechella.application.usecases;

import java.util.List;

import br.com.alura.codechella.application.gateways.IUserRepository;
import br.com.alura.codechella.domain.entity.user.User;

public class ListUsers {

	private final IUserRepository userRepository;
	
	public ListUsers(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> listAll() {
		return userRepository.listAll();
	}
	
}
