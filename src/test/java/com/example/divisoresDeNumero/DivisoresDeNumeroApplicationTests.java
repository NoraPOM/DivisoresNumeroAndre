package com.example.divisoresDeNumero;

import com.example.divisoresDeNumero.controller.ResultadoCalculos;
import com.example.divisoresDeNumero.service.DivisorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DivisoresDeNumeroApplicationTests {

	@Autowired
	DivisorService service;

	@Test
	void testPares_WhenNumeroIsZero_ThenError() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> service.generarDivisores(0));
	}

	@Test
	void testPares_WhenNumeroIsNegative_ThenError() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> service.generarDivisores(-1));
	}

	@Test
	void testPares_WhenNumeroIs5_ThenTwoPares() {
		ResultadoCalculos resultadoCalculos = service.generarDivisores(5);
		Assertions.assertEquals(resultadoCalculos.getPares().size(), 2);
		Assertions.assertEquals(resultadoCalculos.getPares().get(0), 2);
		Assertions.assertEquals(resultadoCalculos.getPares().get(1), 4);
	}

	@Test
	void testPares_WhenNumeroIs1_ThenNotPares() {
		ResultadoCalculos resultadoCalculos = service.generarDivisores(1);
		Assertions.assertEquals(resultadoCalculos.getPares().size(), 0);
	}
}
