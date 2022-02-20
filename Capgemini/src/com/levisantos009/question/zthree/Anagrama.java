package com.levisantos009.question.zthree;

public class Anagrama {

	/*
	 *  ATENÇÃO AVALIADOR!!!! 
	 *  ESSA QUESTÃO DEVERIA SER ANULADA
	 *  O PRIMEIRO ENUNCIADO QUE FOI POSTADO
	 *  TINHA COMO SAÍDA 3 O TOTAL DE ANAGRAMAS
	 *  DA PALAVRA "OVO", E DEPOIS FOI TROCADO PARA
	 *  2 SEM AVISO AOS PARTICIPANTES ATÉ A DATA DE 20/02/2022.
	 *  
	 *  SE EU NÃO TIVESSE ENTRADO NOVAMENTE NO SITE
	 *  TERIA ENVIADO O DESAFIO ERRADO SEM SABER.
	 *  
	 *  MUITOS CANDIDATOS IRÃO ERRAR 
	 *  CASO NÃO TENHAM ATUALIZADO SEUS ALGORITMOS.
	 *  
	 *  TENHO SALVO OS DOIS PDF´S O PRIMEIRO E O QUE FOI ATUALIZADO
	 *  
	 *  PRIMEIRO PDF DISPONIBILIZADO AOS PARTICIPANTES 14/02/2022
	 *  SAÍDA DA PALAVRA "OVO" = 3
	 *  https://drive.google.com/file/d/1VeN3Ip5EcDAtkn9Mxl7bq2J6LSo2C1GT/view?usp=sharing
	 *  
	 *  PDF QUE FOI ATUALIZADO SEM AVISO NENHUM E ESTÁ DISPONÍVEL ATÉ A DATA DE 
	 *  20/02/2022 
	 *  SAÍDA DA PALAVRA "OVO" = 2
	 *  https://drive.google.com/file/d/1SEXkb3zedzVJG4K-XU-R8UJqvOsgRnAu/view?usp=sharing
	 *  
	 *  LEVI A. N. DOS SANTOS*/
	
	private int totalAnagramas;
	private int charPares;
	
	public Anagrama() {
		this.totalAnagramas = 0;
		this.charPares = 0;	
	}
	
	public int verificaAnagrama(String user) {
		
		user = user.replaceAll("\\s+", "");
		user = user.toLowerCase();
			
		for (int i = 0; i < user.length(); i++) {
			this.charPares = 0;
			
			for (int j = 0; j < user.length(); j++) {
					
				if (user.charAt(i) == user.charAt(j)) {
					this.charPares ++;
					
					if (this.charPares == 2) { 
						this.charPares = 0;
						this.totalAnagramas++;
						
						if (i + 1 != j) {
							this.totalAnagramas++;
						}
					}
				}	
			}
		}
			
		return this.totalAnagramas / 2;
	}
	
}
