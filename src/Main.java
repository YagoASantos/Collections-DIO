import com.list.carrinhodecompras.CarrinhoDeCompras;
import com.list.listadetarefas.ListaDeTarefas;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Bala", 0.15, 20);
        carrinho.adicionarItem("Tomate", 5.0, 2);
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
    }
}