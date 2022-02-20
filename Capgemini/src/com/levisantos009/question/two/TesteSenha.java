package com.levisantos009.question.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TesteSenha {

	@Test
	public void TestaSenha() {
		Scanner read = new Scanner(System.in);
			
			System.out.print("Digite sua senha:");
			String pass = read.next();
		
			
			Senha senha = new Senha(pass);
			
			assertEquals(0, senha.verResultado());
			System.out.println("Parabéns, senha segura!");
		read.close();
	}

}
