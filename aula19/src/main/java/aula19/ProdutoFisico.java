package aula19;

public class ProdutoFisico extends Produto {
    private double taxaEntrega;
    

    public ProdutoFisico(String nome, double preco, double taxaEntrega) {
        super(nome, preco);
        this.taxaEntrega = taxaEntrega;
    }

    public double getTaxaEntrega() {return taxaEntrega;}
    public void setTaxaEntrega(double taxaEntrega) {this.taxaEntrega = taxaEntrega;}

    @Override
    public double calcularPrecoFinal() {
        return getTaxaEntrega() + getPreco();
    }
}