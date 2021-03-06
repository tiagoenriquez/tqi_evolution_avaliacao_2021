package com.tiagoenriquez.tqi_evolution_avaliacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TqiEvolutionAvaliacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TqiEvolutionAvaliacaoApplication.class, args);
	}

    /**
     * Retorna uma instância da classe responsável por criptografar as senhas.
     * @return
     */
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
