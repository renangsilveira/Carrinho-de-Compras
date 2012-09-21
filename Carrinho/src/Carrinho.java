/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40804410
 */
//package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> produtos;

	public Carrinho() {
		produtos = new ArrayList<>();
	}

	public void adicionaProduto(Produto produto) {
		produtos.add(produto);
	}

	  
        public boolean removeProduto(String nomeProduto) {
		
            for(Produto p : this.produtos) {
			if (p.getNome()==nomeProduto) {
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
	
            if(this.produtos.size() >= 0){
                 System.out.println("Carrinho Vazio");
                 return;
            }
            for (Produto p : this.produtos) {
				if (p.getNome()==nome) {
					System.out.println(p);
				}
			}
	}
	
	
	public boolean buscaProduto (String nomeProduto) {
		
            for(Produto p : this.produtos) {
			if (p.getNome()==nomeProduto) {
				return true;
			}
		}
		return false;
	}	
	
        
        
	public void mostraTodos () {
		
            for (Produto p : this.produtos) System.out.println(p);
        }
        
        public int calculaPreco(){
        
            int tot=0;
            
            for(Produto p: this.produtos){
                
                tot += p.getPreco();
            
            }
            return tot;
        }
        
        

}
