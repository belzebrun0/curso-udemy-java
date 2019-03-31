package com.udemy.collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Set<String> aprovados = new HashSet<>();
		//Set<String> aprovados = new LinkedHashSet<>(); Ordem de Inserção
		Set<String> aprovados = new TreeSet<>(); // Ordem Alfabética / Menor para o Maior
		aprovados.add("Jõao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		
		for(String nome : aprovados) {
			System.out.println(nome);
		}
	}

}
