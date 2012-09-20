/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 40804410
 */
import java.util.*;


public class Main {
	public static void main(String[] args) {
		
		Carrinho carrinho = new carrinho();
		int opcao;
		String confirm;
		Scanner in = new Scanner(System.in);
		String nomeProduto;
		
		System.out.println("Bem vindo a Virtual Store.\n\n");
		System.out.println("Logado como: Calebe\n\n");
		while (true) {
			System.out.println("O que você deseja fazer?\n\t1 - Incluir um produto\n\t2 - Remover um produto\n\t3 - Listar todos produtos\n\t4 - Buscar um produto\n\nOpção: ");
			opcao = in.nextByte();
			switch (opcao) {
			case 1:
				String nome;
				int quantidade;
				float preco;
				System.out.println("Informe o nome do novo produto: ");
				nome = in.next();
				System.out.println("Quantidade:");
				quantidade = in.nextInt();
				System.out.println("Preço: ");
				preco = in.nextFloat();
				Product p = new Product(nome, quantidade, preco);
				store.addProduct(p);
				System.out.println("Produto adicionado com sucesso.");
				break;
			case 2:
				System.out.println("Informe o nome do produto que você deseja remover: ");
				nomeProduto = in.next();
				if (store.productSearch(nomeProduto)) {
					System.out.println("Achamos o seguinte produto:\n");
					store.showProduct(nomeProduto);
					System.out.println("\nVocê tem certeza que deseja remover este produto? (s/n)");
					confirm = in.next();
					if (confirm.equals("s")) {
						if (store.productRemoval(nomeProduto)) {
							System.out.println("Produto removido com sucesso.");
						}
					} else {
						System.out.println("Ação não confirmada.\n");
					}
				} else {
					System.out.println("Nenhum produto encontrado com o nome: " + nomeProduto);
				}
				break;

			case 3: 
				System.out.println("Sua loja contém os seguintes produtos:\n");
				store.showAll();
				break;
			case 4:
				System.out.println("Informe o nome do produto que você deseja buscar: ");
				nomeProduto = in.next();
				if (store.productSearch(nomeProduto)) {
					System.out.println("Produto encontrado com sucesso");
					store.showProduct(nomeProduto);
				} else {
					System.out.println("Nenhum produto encontrado com o nome: " + nomeProduto);
				}
				break;				
			}
		}
	}
}