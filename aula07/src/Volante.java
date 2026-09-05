public class Volante extends Jogador {

    public Volante(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void jogar() {
        System.out.println("Volante " + nome + " (#" + numeroCamisa + ") em campo!");
    }
}