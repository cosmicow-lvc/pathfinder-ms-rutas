package com.example.ms_rutas;

import org.springframework.boot.SpringApplication;

public class TestMsRutasApplication {

	public static void main(String[] args) {
		SpringApplication.from(MsRutasApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
