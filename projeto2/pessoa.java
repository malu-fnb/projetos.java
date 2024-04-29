import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String ID;
    private String senha;

    void setId(String id) {
        this.ID = id;
    }

    String getId() {
        return ID;
    }

    void setSenha(String senha) {
        this.senha = senha;
    }

    String getSenha() {
        return senha;
    }

    int verificarSenha(String senha) {
        return this.senha.equals(senha) ? 1 : 0;
    }

    static int busca(ArrayList<Pessoa> pessoas, String input) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId().equals(input)) {
                return i;
            }
        }
        return -1;
    }

    void setInfo(String nome, String end, String tel) {
        this.nome = nome;
        this.endereco = end;
        this.telefone = tel;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    String getEndereco() {
        return endereco;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    String getTelefone() {
        return telefone;
    }

    void get_info() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    void menu(Scanner scan) { //na verdade esse menu seria opicional para a Funcionalidade do código.
        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Visualizar informações");
            System.out.println("2. Alterar informações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
    
            switch (opcao) {
                case 1:
                    get_info();
                    break;
                case 2:
                    alterar_informacoes(scan);
                    break;
                case 0:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
    
    void alterar_informacoes(Scanner scan) {
        System.out.println("Selecione o que deseja alterar:");
        System.out.println("1. Nome");
        System.out.println("2. Endereço");
        System.out.println("3. Telefone");
        System.out.println("0. Voltar");
    
        int opcao = scan.nextInt();
        scan.nextLine(); // Consumir a quebra de linha pendente
    
        switch (opcao) {
            case 1:
                System.out.print("Novo nome: ");
                String novoNome = scan.nextLine();
                setNome(novoNome);
                System.out.println("Nome alterado com sucesso!");
                break;
            case 2:
                System.out.print("Novo endereço: ");
                String novoEndereco = scan.nextLine();
                setEndereco(novoEndereco);
                System.out.println("Endereço alterado com sucesso!");
                break;
            case 3:
                System.out.print("Novo telefone: ");
                String novoTelefone = scan.nextLine();
                setTelefone(novoTelefone);
                System.out.println("Telefone alterado com sucesso!");
                break;
            case 0:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

}
