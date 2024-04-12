public abstract class Funcionário {
    private String nome;
    private int idade;
    private double salarioBase;

    public Funcionário(String nome, int idade, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, int idade, double salarioBase, String disciplina) {
        super(nome, idade, salarioBase);
        this.disciplina = disciplina;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.5; 
    }
}

class FuncionarioAdministrativo extends Funcionário {
    private String cargo;

    public FuncionarioAdministrativo(String nome, int idade, double salarioBase, String cargo) {
        super(nome, idade, salarioBase);
        this.cargo = cargo;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("lucas", 1, 2, "mat");
        FuncionarioAdministrativo funcionarioAdministrativo = new FuncionarioAdministrativo("malu", 3, 4, "secretaria");
        System.out.println("salario: " + professor.getNome() + ": R$" + professor.calcularSalario());
        System.out.println("slario: " + funcionarioAdministrativo.getNome() + ": R$" + funcionarioAdministrativo.calcularSalario());
    }
}
