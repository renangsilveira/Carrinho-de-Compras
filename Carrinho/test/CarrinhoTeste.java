/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author 30935490
 */
public class CarrinhoTeste {
    
    public CarrinhoTeste() {
    }

    @Test
    public void TestAdicionar() {
            Carrinho c = new Carrinho();
            Produto p = new Produto("Echoes", 50.0, 1, 5);
            c.adicionaProduto(p);
         
	}
    @Test
    public void TestListar(){
        Carrinho c = new Carrinho();
        Produto p1 = new Produto("Echoes", 50.0, 1, 5);
        Produto p2 = new Produto("Atomic", 33, 2, 3);
        Produto p3 = new Produto("Final Cut", 78.5, 3, 12);
        
        c.adicionaProduto(p1);
        c.adicionaProduto(p2);
        c.adicionaProduto(p3);
        
        c.mostraTodos();
    }
    
    @Test
    public void TestRemove(){
        
        Carrinho c = new Carrinho();
        Produto p1 = new Produto("Nevermind", 50.0, 1, 5);
        Produto p2 = new Produto("Animals", 33, 2, 3);
        Produto p3 = new Produto("Dark Side of the Moon", 78.5, 3, 12);
        
        c.adicionaProduto(p1);
        c.adicionaProduto(p2);
        c.adicionaProduto(p3);
        
        c.removeProduto("Nevermind");
    
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
