public class Atacante extends Jogador{
    
    public Atacante(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void jogar() {
        System.out.println("Atacante " + nome + " (#" + numeroCamisa + ") em campo!");
    }
}
