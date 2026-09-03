public class Vendedor extends Funcionario {
    private double salarioBase;
    private double comissao;
    
    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        double calculo = getSalarioBase() + getComissao();

        return calculo;
    }

}
