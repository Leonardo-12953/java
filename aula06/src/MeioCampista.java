public class MeioCampista extends Jogador{

    public MeioCampista(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }


    @Override
    public void jogar() {
        System.out.println("Meio Campo " + nome + " (#" + numeroCamisa + ") em campo!");
    }
}
