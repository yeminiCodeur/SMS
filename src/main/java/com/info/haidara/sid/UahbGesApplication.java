package com.info.haidara.sid;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.info.haidara.sid.entities.Filiere;
import com.info.haidara.sid.services.FiliereStrategy;

@SpringBootApplication
public class UahbGesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UahbGesApplication.class, args);
	}

	@Bean
	CommandLineRunner start(FiliereStrategy fs)
	{
		return args->{
			Stream.of("A","B","C").forEach(nf->{
				
				 fs.addNewFiliiere(new Filiere());
			});
		};
	}
	
}

