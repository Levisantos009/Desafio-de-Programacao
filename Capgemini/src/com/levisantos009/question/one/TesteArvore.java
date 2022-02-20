package com.levisantos009.question.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TesteArvore {

	@Test
	public void testaArvore() {
		
		Scanner read = new Scanner(System.in);
			System.out.print("Digite o valor de N:");
			int n = read.nextInt();
			
			Arvore capgemini = new Arvore();
			
			assertEquals(0, capgemini.montaArvore(n));
		read.close();
	}

}
