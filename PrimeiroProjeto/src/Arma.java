public class Arma {
    private String nome;
    private int danoBase;

    public Arma(String nome, int danoBase) {
        this.nome = nome;
        this.danoBase = danoBase;
    }

    // getter
    public String getNome() {
        return nome;
    }
    public int getDanoBase() {
        return danoBase;
    }

    public void usarArma() {
        System.out.println("Atacando com a arma...");
    }
}
