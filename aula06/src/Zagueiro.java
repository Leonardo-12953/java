public class Zagueiro extends Jogador{

    public Zagueiro(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void jogar() {
        System.out.println("Zagueiro " + nome + " (#" + numeroCamisa + ") em campo!");
    }
}
