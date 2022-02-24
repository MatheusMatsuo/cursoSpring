package com.educandoweb.cursoSpring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.cursoSpring.entities.User;
import com.educandoweb.cursoSpring.repositories.UserRepository;

@Configuration
@Profile("test") //Para o Spring identificar que rodará essa configuração quando estiver no perfil test
public class testConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override //Executará  quando a aplicação for iniciado
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
