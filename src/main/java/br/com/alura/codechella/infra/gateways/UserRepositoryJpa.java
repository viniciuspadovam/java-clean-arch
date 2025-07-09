package br.com.alura.codechella.infra.gateways;

import java.util.List;

import br.com.alura.codechella.application.gateways.IUserRepository;
import br.com.alura.codechella.domain.entity.user.User;
import br.com.alura.codechella.infra.persistence.UserEntity;
import br.com.alura.codechella.infra.persistence.UserRepository;

public class UserRepositoryJpa implements IUserRepository {
	
	private final UserRepository userRepository;
	private final UserEntityMapper userEntityMapper;
	
	public UserRepositoryJpa(UserRepository userRepository, UserEntityMapper userEntityMapper) {
		this.userRepository = userRepository;
		this.userEntityMapper = userEntityMapper;
	}

	@Override
	public User create(User user) {
		UserEntity entity = userEntityMapper.toEntity(user);
		UserEntity savedUser = userRepository.save(entity);
		return userEntityMapper.toDomain(savedUser);
	}

	@Override
	public List<User> listAll() {
		List<UserEntity> allUsers = userRepository.findAll();
		return allUsers.stream()
			.map(userEntityMapper::toDomain)
			.toList();
	}

}
