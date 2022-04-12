package br.com.luiz.lista.util;

import java.util.function.Predicate;

import br.com.luiz.lista.entitie.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}

}
