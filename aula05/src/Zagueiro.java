public class Zagueiro extends Jogador {

    public Zagueiro(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void jogar() {
        System.out.println("Jogador: "+ nome +" camisa: #"+ numeroCamisa +" -> Zagueiro ✅ Escalado para partida.");
    }

}
