import com.list.list.ordenacaodepessoas.OrdenacaoPessoas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas pessoasOrdenadas = new OrdenacaoPessoas();
        pessoasOrdenadas.adicionarPessoa("pessoa1", 1, 1.5);
        pessoasOrdenadas.adicionarPessoa("pessoa5", 3, 1.8);
        pessoasOrdenadas.adicionarPessoa("pessoa3", 12, 1.3);
        pessoasOrdenadas.adicionarPessoa("pessoa2", 24, 1);
        System.out.println(pessoasOrdenadas.ordenarPorAltura());
        System.out.println(pessoasOrdenadas.ordenarPorIdade());
    }
}