package com.udemy.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//Em caso de erro, offer retorna false e add retorna um erro.
		fila.offer("Maria");
		fila.offer("João");
		fila.add("Pedro");
		
		System.out.println("Peek / Element"); //Em caso de erro, peek retorna null e element retorna um erro.
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Poll / Remove");//Em caso de erro, poll retorna null e remove retorna um erro
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}

}
