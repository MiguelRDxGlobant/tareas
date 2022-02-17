package com.topic2.impresora;

import com.topic2.impresora.models.Impresora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImpresoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImpresoraApplication.class, args);

		Impresora impresora1 = new Impresora();

		impresora1.imprimirAcolor();

		impresora1.imprimirBlancoYNegro();

	}

}
