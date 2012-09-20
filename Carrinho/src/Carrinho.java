/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40804410
 */
package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> produtos;

	public Carrinho() {
		produtos = new ArrayList<>();
	}

	public void add(Produto produto) {
		produtos.add(produto);
	}

	public boolean produtoRemove(String nomeProduto) {
		for(Produto p : this.produtos) {
			if (p.getName().equals(nomeProduto)) {
				this.produtos.remove(p);
				return true;
			}
		}
		return false;
	}
        
        
        public Produto menorProduto() throws CarrinhoVazioExpected {
		if (produtos.size() == 0)
			throw new CarrinhoVazioExpected();
		Produto menor = produtos.get(0);
		for (Produto produto : produtos) {
			if (produto.getPreco() < menor.getPreco())
				menor = produto;
		}
		return menor;
	}
        public void MostraProduto(String nome) {
		if (this.getQuantity() > 0) {
			for (Produto p : this.produtos) {
				if (p.getName().equals(nome)) {
					System.out.println(p);
				}
			}
		} else {
			System.out.println("Seu carrinho ainda não possui produtos.\n");
		}
	}
	
	public int getQuantity() {
		return this.produtos.size();
	}
	
	public boolean productSearch (String nomeProduto) {
		for(Produto p : this.produtos) {
			if (p.getName().equals(nomeProduto)) {
				return true;
			}
		}
		return false;
	}	
	
	public void showAll () {
		for (Produto p : this.produtos) {			
			System.out.println(p);
		}
		System.out.println();
	}
        
        

}
