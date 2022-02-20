package com.levisantos009.question.two; 
import java.util.ArrayList;
import java.util.regex.*;

public class Senha {
	
	private String regexDigito;
	private String regexMaiscula;
	private String regexMinuscula;
	private String regexSimbolos;
	private Pattern pattern;
	private Matcher matcher;
	private ArrayList<String> erros;
	
	public Senha(String senha) {
		this.erros = new ArrayList<String>();
		this.regexDigito = "[0-9]";
		this.regexMaiscula = "[A-Z]";
		this.regexMinuscula = "[a-z]";
		this.regexSimbolos = "[!@#$%^&*()-+]";
		this.verificaSenha(senha);
	}
	
	public  boolean regex(String padrao, String alvo) {
		this.pattern = Pattern.compile(padrao);
		this.matcher = pattern.matcher(alvo);
		return this.matcher.find();
	}
	
	private  void verificaSenha(String senha) {
		this.verificaTamanho(senha);
	}
	
	
	private  void verificaTamanho(String senha) {
		if (senha.length() >= 6) {
			this.verificaDigito(senha);
		} else {
			erros.add("Sua senha deve ter no mínimo 6 caracteres!");
			this.verificaDigito(senha);
		}
	}
	
	private  void verificaDigito(String senha) {
		if (this.regex(regexDigito, senha)) {
			this.verificaCaracteresUpper(senha);
		} else {
			erros.add("Sua senha deve ter no mínimo 1 dígito numérico!");
			this.verificaCaracteresUpper(senha);
		}
	}
	
	private  void verificaCaracteresUpper(String senha) {
		if (this.regex(regexMaiscula, senha)) {
			this.verificaCaracteresLower(senha);
		} else {
			erros.add("Sua senha deve ter no mínimo 1 caracter maiúsculo!");
			this.verificaCaracteresLower(senha);
		}
		
	}
	
	private  void verificaCaracteresLower(String senha) {
		if (regex(regexMinuscula, senha)) {
			this.verificaSimbolos(senha);
		} else {
			erros.add("Sua senha deve ter no mínimo 1 caracter minúsculo!");
			this.verificaSimbolos(senha);
		}
	}
	
	private  void verificaSimbolos(String senha) {
		if (!this.regex(regexSimbolos, senha)) {
			erros.add("Sua senha deve ter no mínimo 1 símbolo !@#$%^&*()-+");	
		}
	}
	
	
	public int verResultado() {
		if (erros.size() != 0) {
			for (int i = 0; i < erros.size(); i++) {
				System.err.println(erros.get(i));
			}
		} 
		return this.erros.size();
		
	}
	
}
