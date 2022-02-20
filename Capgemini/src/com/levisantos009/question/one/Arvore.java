package com.levisantos009.question.one;

public class Arvore {
	
	private String repeated;
	private String space;
	private int j;

	public Arvore() {
		this.repeated = "";
		this.space = "";
		this.j = 0;
	}
	
	public int montaArvore(int n) {

		j = n;
		
		for(int i = 1; i < n + 1; i ++) {
			this.repeated = new String(new char[i]).replace("\0", "*");
			j--;
			this.space = "%-" + j + "s";
			if (j == 0) {
				System.out.println(this.repeated);
			} else {
				System.out.println(String.format(space, "") + this.repeated);					
			}
		}
		return this.j;
	}
}
