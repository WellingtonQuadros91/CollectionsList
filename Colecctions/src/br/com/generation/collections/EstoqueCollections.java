package br.com.generation.collections;

import java.util.ArrayList;

public class EstoqueCollections {

	public static void main(String[] args) {
		
		ArrayList <String> estoque = new ArrayList();
		
		String estoque1 = "Camisetas";
		String estoque2 = "Calças";
		String estoque3 = "Bermudas";
		String estoque4 = "Moletons";
		
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println("O estoque possui " + estoque.size() + " tipos de peças");
		System.out.println("=================================================================================");
		
		System.out.println("Mostrando itens que estão no estoque: " + estoque);

		estoque.remove(1);		
		System.out.println("Todas as calças foram vendidas");
		System.out.println("=================================================================================");
		
		System.out.println("Mostrando itens restantes no estoque: " + estoque);
		System.out.println("O estoque possui " + estoque.size() + " tipos de peças");
		System.out.println("=================================================================================");
		
		estoque.add(estoque2);
		System.out.println("Novas" + estoque2 + "foram compradas e colocadas no estoque ");
		System.out.println("=================================================================================");
		System.out.println("Lista completa dos produtos em estoque: " + estoque);
	}
}
