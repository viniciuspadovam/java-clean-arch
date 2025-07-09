package br.com.alura.codechella.domain.entity.user;

import java.time.LocalDate;

import br.com.alura.codechella.domain.Address;

public class UserBuilder {

	private User user;
	
	public User createWithNameCpfAndBirth(String name, String cpf, LocalDate birth) {
		this.user = new User(cpf, name, birth, "");
		return this.user;
	}
	
	public User addAddress(String cep, Integer number, String complement) {
		this.user.setAddress(new Address(cep, number, complement));
		return this.user;
	}

}
