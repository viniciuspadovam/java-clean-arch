package br.com.alura.codechella.domain.entity.user;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class UserTest {
	
	@Test
	public void shouldNotCreateUserWhenInvalidCpf() {
		assertThrows(IllegalArgumentException.class, 
			() -> new User("123456789-22", "Joseph", LocalDate.parse("1900-03-19"), "test@test.com"));
	}

}
