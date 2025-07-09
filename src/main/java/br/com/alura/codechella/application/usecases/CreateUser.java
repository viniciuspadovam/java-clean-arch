package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.IUserRepository;
import br.com.alura.codechella.domain.entity.user.User;

public class CreateUser {
	
	private final IUserRepository userRepository;
	
	public CreateUser(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User create(User user) {
		return userRepository.create(user);
	}

}
