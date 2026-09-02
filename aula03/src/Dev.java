public class Dev extends Funcionario {
    private double salarioFixo;

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return getSalarioFixo();
    }
    

}
