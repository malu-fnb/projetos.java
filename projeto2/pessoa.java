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

    void menu(Scanner scan) {
        // Adicione aqui o código do menu, se necessário
    }
}
