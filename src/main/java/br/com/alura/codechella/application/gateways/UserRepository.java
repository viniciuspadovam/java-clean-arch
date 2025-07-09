package br.com.alura.codechella.application.gateways;

import java.util.List;

import br.com.alura.codechella.domain.entity.user.User;

public interface UserRepository {
	
	User create(User user);
	
	List<User> listAll();

}
