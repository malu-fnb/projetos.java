public class Funcionario extends Pessoa {
    String idFuncionario;
    String turno;

    void setInfo(String nome, String end, String tel, String Turno) {
        super.setInfo(nome, end, tel);
        this.turno = Turno;
    }

    void get_info() {
        super.get_info();
        System.out.println("Id: " + idFuncionario);
        System.out.println("Turno: " + turno);
    }
}
