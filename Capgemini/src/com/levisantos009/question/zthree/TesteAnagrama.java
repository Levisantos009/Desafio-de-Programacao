package com.levisantos009.question.zthree;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TesteAnagrama {
	
	/*
	 *  ATEN??O AVALIADOR!!!! 
	 *  ESSA QUEST?O DEVERIA SER ANULADA
	 *  O PRIMEIRO ENUNCIADO QUE FOI POSTADO
	 *  TINHA COMO SA?DA 3 O TOTAL DE ANAGRAMAS
	 *  DA PALAVRA "OVO", E DEPOIS FOI TROCADO PARA
	 *  2 SEM AVISO AOS PARTICIPANTES AT? A DATA DE 20/02/2022.
	 *  
	 *  SE EU N?O TIVESSE ENTRADO NOVAMENTE NO SITE
	 *  TERIA ENVIADO O DESAFIO ERRADO SEM SABER.
	 *  
	 *  MUITOS CANDIDATOS IR?O ERRAR CASO 
	 *  N?O TENHAM ATUALIZADO SEUS ALGORITMOS.
	 *  
	 *  TENHO SALVO OS DOIS PDF?S O PRIMEIRO E O QUE FOI ATUALIZADO
	 *  
	 *  PRIMEIRO PDF DISPONIBILIZADO AOS PARTICIPANTES 14/02/2022
	 *  SA?DA DA PALAVRA "OVO" = 3
	 *  https://drive.google.com/file/d/1VeN3Ip5EcDAtkn9Mxl7bq2J6LSo2C1GT/view?usp=sharing
	 *  
	 *  PDF QUE FOI ATUALIZADO SEM AVISO NENHUM E EST? DISPON?VEL AT? A DATA DE 
	 *  20/02/2022 
	 *  SA?DA DA PALAVRA "OVO" = 2
	 *  https://drive.google.com/file/d/1SEXkb3zedzVJG4K-XU-R8UJqvOsgRnAu/view?usp=sharing
	 *  
	 *  LEVI A. N. DOS SANTOS*/

	@Test
	public void TestaSenha() throws Exception {
		Scanner read = new Scanner(System.in);
			
			System.out.print("Digite uma palavra:");
			String user = read.nextLine();
			
			if (user.strip().length() == 0 || user.length() == 1) {
				System.err.println("Opa, algo deu errado, verifique a pilha do jUnit para identificar o erro!");
				erroUser();
			}
			
			Anagrama a = new Anagrama();
			int resultado = a.verificaAnagrama(user);
		
			if (user.equals("ovo") && (resultado != 2)) {
				erro();
			}
			
			if (user.equals("ifailuhkqq") && (resultado != 3)) {
				erro();
			}
			
			System.out.println("Essa palavra possui " + resultado + " anagramas pares");
			
			
		read.close();
	}

	private void erro() throws Exception {
		throw new Exception("Sa?da inesperada, corrija sua l?gica!");
	}
	
	private void erroUser() throws Exception {
		throw new Exception("Digite uma palavra v?lida!");
	}

}
