package br.com.alura.codechella.domain.entity.user;

import java.time.LocalDate;

import br.com.alura.codechella.domain.Address;

public class User {

	private String cpf;
	private String name;
	private LocalDate birth;
	private String email;
	private Address address;
	
	public User(String cpf, String name, LocalDate birth, String email) {
		if(cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
			throw new IllegalArgumentException("Cpf Inválido");

		this.cpf = cpf;
		this.name = name;
		this.birth = birth;
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
