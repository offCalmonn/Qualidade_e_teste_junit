package CarrinhoTeste;

import carrinho.Carrinho;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import produto.Produto;

public class CarrinhoTest {
    @Test
    public void VerificarValorTotal() {
	Carrinho car = new Carrinho();
        Produto camisa = new Produto("Camiseta High",180);
        Produto shorts = new Produto("Short Nike",200);
        Produto tenis = new Produto ("Tênis Nike Air Force 1",1000);
        car.addItem(camisa);
        car.addItem(shorts);
        car.addItem(tenis);
        double valor = car.getValorTotal(); 
        assertEquals(1800, valor);	
    }
    @Test
    public void VerificaPrecoDoProduto(){
        Carrinho car = new Carrinho();
        Produto tenis = new Produto ("Tenis Nike Air Force 97",900);
        double valor = tenis.getPreco();
        assertEquals(900,valor);
    }
    @Test
    public void VerificaNomeDoProduto(){
         Carrinho car = new Carrinho();
        Produto bone = new Produto ("Boné Adidas Originals",150);
        String nome = bone.getNome();
        assertEquals("Boné Adidas Originals",nome);
    }
}