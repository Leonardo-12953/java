package aula19;

public class ProdutoDigital extends Produto {
    private String linkDownload;

    public ProdutoDigital(String nome, double preco, String linkDownload) {
        super(nome, preco);
        this.linkDownload = linkDownload;
    }

    public String getLinkDownload() {return linkDownload;}
    public void setLinkDownload(String linkDownload) {this.linkDownload = linkDownload;}

    @Override
    public double calcularPrecoFinal() {
        return getPreco();
    }

}