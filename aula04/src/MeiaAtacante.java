public class MeiaAtacante extends Jogador implements BatedorDeFalta {

    public MeiaAtacante(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void jogar() {
        System.out.println("A bola cai no pé do "+ nome +" é o camisa "+ numeroCamisa +" do time..");
        System.out.println(nome +" toca em profundidade para o atacante.");
    }
    @Override
    public void cobrarFalta() {
        System.out.println(nome +" Ajeita a bola com carinho.. \nEle vem correndo pra bola..");
        System.out.println(nome +" camisa #"+ numeroCamisa +" chutooouu a bola onde a coruja dorme, marcando um golaaaçooo!!!");
    }

}
