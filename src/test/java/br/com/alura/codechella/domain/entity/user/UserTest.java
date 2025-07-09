package br.com.alura.codechella.domain.entity.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class UserTest {
	
	@Test
	public void shouldNotCreateUserWhenInvalidCpf() {
		assertThrows(IllegalArgumentException.class, 
			() -> new User("123456789-22", "Joseph", LocalDate.parse("1900-03-19"), "test@test.com"));
	}
	
	@Test
	public void shouldCreateUserWithFactory() {
		UserBuilder userBuilder = new UserBuilder();
		User user = userBuilder
			.createWithNameCpfAndBirth("Jeremiah", "321.654.987-00", LocalDate.parse("2000-10-02"));
		
		assertEquals("Jeremiah", user.getName());
		
		user = userBuilder.addAddress("26904810", 2905, "apto 45");
		
		assertEquals("26904810", user.getAddress().getCep());
	}

}
