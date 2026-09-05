public abstract class Jogador {
    protected String nome;
    protected int numeroCamisa;

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;

    }

    // getter e setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    public String getNome() {
        return nome;
    }
    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public abstract void jogar();

}
