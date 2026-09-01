public class Veiculo {
    private String cor;
    private String modelo;
    private String marca;
    private int ano;
    
    
    // setando
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    // getter
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }


    public void acelerar() {
        System.out.println("Acelerando...");
    }


}
