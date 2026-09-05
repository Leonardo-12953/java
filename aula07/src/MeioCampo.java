public class MeioCampo extends Jogador {

    public MeioCampo(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void jogar() {
        System.out.println("Volante " + nome + " (#" + numeroCamisa + ") em campo!");
    }
}