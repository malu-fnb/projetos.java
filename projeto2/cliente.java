import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String idCliente;
    ArrayList<String> listaLivros = new ArrayList<String>();

    void setId(String id) {
        this.idCliente = id;
    }

    String getId() {
        return idCliente;
    }

    void emprestarLivro(String nomeLivro) {
        this.listaLivros.add(nomeLivro);
    }

    void imprimirLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("O cliente não possui livros emprestados.");
        } else {
            int i = 1;
            System.out.println("\t Livros emprestados \t");
            System.out.println("-------------------------------");
            for (String livro : listaLivros) {
                System.out.println(i + ". " + livro);
                i++;
            }
            System.out.printf("-------------------------------%n");
        }
    }

    void devolverLivro(int numero) {
        if (numero > 0 && numero <= listaLivros.size()) {
            listaLivros.remove(numero - 1);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Número de livro inválido. Nenhum livro foi devolvido.");
        }
    }
}
