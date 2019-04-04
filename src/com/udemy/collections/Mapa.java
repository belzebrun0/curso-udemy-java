package com.udemy.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> aprovados = new HashMap<>();
		
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");
		
		System.out.println(aprovados.keySet());
		System.out.println(aprovados.values());
		System.out.println(aprovados.entrySet());
		
		aprovados.put(3, "Beatriz");
		System.out.println(aprovados.get(3));
		
		System.out.println(aprovados.containsKey(4));
		System.out.println(aprovados.containsValue("Bia"));
		
		for(Integer chave : aprovados.keySet()) {
			System.out.println(chave);
		}
		
		for(String nome : aprovados.values()) {
			System.out.println(nome);
		}
		
		for(Entry<Integer, String> registro : aprovados.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
	}

}
