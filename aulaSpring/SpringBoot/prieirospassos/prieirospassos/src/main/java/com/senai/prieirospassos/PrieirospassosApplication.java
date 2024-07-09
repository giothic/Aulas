package com.senai.prieirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@SpringBootApplication
public class PrieirospassosApplication {

	@RequestMapping("/")
	String home(){
		return "Olá Mundo!";
	}

	@RequestMapping("user")
	public String user() {
		return "Não temos usuários cadastrados.";
	}
	
	@RequestMapping("calc")
	public int calc(){
		return 3 + 6;
	}
	
	

	

	public static void main(String[] args) {
		SpringApplication.run(PrieirospassosApplication.class, args);
	}

}
