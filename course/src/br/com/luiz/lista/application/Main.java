package br.com.luiz.lista.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.luiz.lista.entitie.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.00; //Desta forma o usu�rio poderia digitar o valor
		
		list.removeIf(p -> p.getPrice() >= min); //removendo itens pre�o menor que 100.00
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
	
	
}
