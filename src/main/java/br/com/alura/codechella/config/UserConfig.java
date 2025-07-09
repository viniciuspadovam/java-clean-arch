package br.com.alura.codechella.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.alura.codechella.application.gateways.IUserRepository;
import br.com.alura.codechella.application.usecases.CreateUser;
import br.com.alura.codechella.application.usecases.ListUsers;
import br.com.alura.codechella.infra.gateways.UserEntityMapper;
import br.com.alura.codechella.infra.gateways.UserRepositoryJpa;
import br.com.alura.codechella.infra.persistence.UserRepository;

@Configuration
public class UserConfig {

	@Bean
	CreateUser createUser(IUserRepository userRepository) {
		return new CreateUser(userRepository);
	}
	
	@Bean
	ListUsers listUsers(IUserRepository userRepository) {
		return new ListUsers(userRepository);
	}
	
	@Bean
	UserRepositoryJpa userRepositoryJpa(UserRepository userRepository, UserEntityMapper userEntityMapper) {
		return new UserRepositoryJpa(userRepository, userEntityMapper);
	}
	
	@Bean
	UserEntityMapper userEntityMapper() {
		return new UserEntityMapper();
	}
	
}
