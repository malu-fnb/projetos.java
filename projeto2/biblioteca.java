import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
    private Scanner scanner = new Scanner(System.in);
    ArrayList <Cliente> clientes = new ArrayList<>();
    ArrayList <Livro> livros = new ArrayList<>();

    void addCliente(String nome, String endereco, String tel, String id){
        Cliente associado = new Cliente();
        associado.SetInfo(nome, endereco, tel);
        associado.setId(id);
        clientes.add(associado);
    }

    void rmvCliente(int ind){
        System.out.println("Escolha o cliente a ser removido:");
        for (int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            System.out.printf("%d. %s | %s | %s%n", i + 1, cliente.getId(), cliente.GetNome(), cliente.GetTelefone());
        }
        System.out.println("Digite o número correspondente ao cliente:");
        int opcao = scanner.nextInt();
        if (opcao > 0 && opcao <= clientes.size()) {
            clientes.remove(opcao - 1);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Opção inválida. Nenhum cliente foi removido.");
        }
    }
}
