package com.udemy.collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Set<String> aprovados = new HashSet<>();
		//Set<String> aprovados = new LinkedHashSet<>(); Ordem de Inser��o
		Set<String> aprovados = new TreeSet<>(); // Ordem Alfab�tica / Menor para o Maior
		aprovados.add("J�ao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		
		for(String nome : aprovados) {
			System.out.println(nome);
		}
	}

}
