package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.UserRepository;
import br.com.alura.codechella.domain.entity.user.User;

public class CreateUser {
	
	private final UserRepository userRepository;
	
	public CreateUser(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User create(User user) {
		return userRepository.create(user);
	}

}
