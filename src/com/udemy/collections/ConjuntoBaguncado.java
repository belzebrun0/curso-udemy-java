package com.udemy.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("=== Add ===");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		System.out.println("Size.: " +conjunto.size());
		System.out.println();
		
		System.out.println("=== Remove ===");
		System.out.println(conjunto.remove("a"));
		System.out.println(conjunto.remove('a'));
		System.out.println("Size.: " +conjunto.size());
		System.out.println();
		
		System.out.println("=== Contains ===");
		System.out.println(conjunto.contains('a'));
		System.out.println(conjunto.contains(1));
		System.out.println();
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//conjunto.addAll(nums); Uni�o
		conjunto.retainAll(nums); //Interse��o
		System.out.println("=== Size ===");
		System.out.println(conjunto.size());
		
		conjunto.clear();
		System.out.println(conjunto.isEmpty());
	}

}