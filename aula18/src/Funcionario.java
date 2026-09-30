public class Funcionario extends Pessoa {
    private double salario;
    
    public Funcionario (String nome, String email, double salario) {
        super(nome, email);
        this.salario = salario;
    }

    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}

    public void atenderCliente() {
        System.out.println("Função atender cliente ativada.");
    }
}
