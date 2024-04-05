package estudos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Funcionario {
    private String nome;
    private double salarioAnual;
    private int idade;
    public Funcionario(String nome, double salarioAnual, int idade) {
        this.nome = nome;
        this.salarioAnual = salarioAnual;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public int getIdade() {
        return idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionários deseja adicionar?");
        int numFuncionarios = scanner.nextInt();

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Detalhes do funcionário " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Salário Anual: ");
            double salarioAnual = scanner.nextDouble();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            funcionarios.add(new Funcionario(nome, salarioAnual, idade));
        }

        System.out.println("Funcionários que ganham mais de R$ 50.000 por ano e têm menos de 30 anos:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalarioAnual() > 50000 && funcionario.getIdade() < 30) {
                System.out.println(funcionario.getNome());
            }
        }
        
        scanner.close();
    }
}
