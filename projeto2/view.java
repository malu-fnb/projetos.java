import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Funcionario> proletariado = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();

    static void adicionar_cliente(String nome, String endereco, String tel, String id, String senha, ArrayList<Pessoa> clientes) {
        Cliente associado = new Cliente();
        associado.setInfo(nome, endereco, tel);
        associado.setId(id);
        associado.setSenha(senha);
        associado.setCor(0);
        clientes.add(associado);
    }

    void remover_cliente(Scanner scanner) {
        int j = 1;
        System.out.printf("Id | Nome | Tel.");
        for (Cliente i : clientes) {
            System.out.printf("%d. %s | %s | %s%n", j++, i.getId(), i.getNome(), i.getTelefone());
        }

        System.out.print("Digite o número do cliente que quer remover: ");
        int num = scanner.nextInt();
        clientes.remove(num - 1);
    }

    void add_livro(Scanner scanner) {
        Livro test = new Livro();
        String titulo, autor, id;
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.println("Digite o Título do livro: ");
        titulo = scanner.nextLine();
        System.out.println("Digite o Autor do livro: ");
        autor = scanner.nextLine();
        System.out.println("Digite o Id do livro: ");
        id = scanner.nextLine();
        test.setInfo(titulo, autor, id);
        livros.add(test);
    }

    void remover_livro(Scanner scanner) {
        int r, conf;
        while (true) {
            int j = 1;
            System.out.println("-----------------------------------------------");
            System.out.println("Id | Título | Autor | Status");
            for (Livro i : livros) {
                System.out.println(j++ + " |" + i.getId() + " |" + i.getTitulo() + " |" + i.getAutor() + " |" + i.getStatus());
            }
            System.out.println("-----------------------------------------------");
            System.out.print("Digite o número do livro que você quer remover: ");
            r = scanner.nextInt();
            while (r < 0 || r > j) {
                System.out.print("Digite o número do livro que você quer remover: ");
                r = scanner.nextInt();
            }
            livros.remove(r - 1);
            System.out.println("Deseja remover mais um livro? (Digite 1 para remover um novo livro ou 0 para sair)");
            conf = scanner.nextInt();
            while (conf != 1 && conf != 0) {
                System.out.println("Deseja remover mais um livro? (Digite 1 para remover um novo livro ou 0 para sair)");
                conf = scanner.nextInt();
            }
            if (conf == 0) {
                break;
            }
        }
    }

    void mostrar_livros() {
        int j = 1;
        for (Livro i : livros) {
            System.out.println(j++);
            System.out.println("Id: " + i.getId());
            System.out.println("Nome: " + i.getTitulo());
            System.out.println("Autor: " + i.getAutor());
            System.out.println("Disponível: " + i.getStatus());
            System.out.println("-----------------------------------------------");
        }
    }

    void Emprestar_livro(Cliente cliente, Scanner scanner) {
        mostrar_livros();
        System.out.println("Digite o número do livro que você quer emprestado ");
        int numLivro = scanner.nextInt();
        cliente.EmprestarLivro(livros.get(numLivro - 1));
        this.livros.get(numLivro - 1).setStatus();
    }

    void Devolver_Livro(Cliente cliente, Scanner scanner) {
        cliente.print_Livros();
        System.out.println("Digite o número do livro que você quer devolver ");
        int numLivro = scanner.nextInt();
        for (Livro i : livros) {
            if (cliente.get_nomeLivro(numLivro).equals(i.getTitulo())) {
                i.setStatus();
                break;
            }
        }
        cliente.DevolverLivro(numLivro);
    }

    static void cadastro(ArrayList<Pessoa> pessoas, Scanner scan) {
        scan.nextLine(); // Consumir a quebra de linha pendente
        String input;
        Cliente novo = new Cliente();
        int atual;

        for (atual = 0; atual <= 5; atual++) {
            Visual.displayCadastro(atual, novo);
            if (atual == -1) {
                atual++;
            }
            input = scan.nextLine();
            if (input.equals("0")) {
                return;
            }
            switch (atual) {
                case 0:
                    if (Pessoa.Busca(pessoas, input) != -1) {
                        atual = -2;
                        break;
                    }
                    novo.setId(input);
                    break;

                case 1:
                    novo.setNome(input);
                    break;
                case 2:
                    novo.setEndereco(input);
                   
p
