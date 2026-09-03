public class Atacante extends Jogador {

    public Atacante(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void jogar() {
        System.out.println(nome +" Recebe a bola em profundidade. Encara o marcador..\nEsse camisa "+ numeroCamisa +" É abusado, cortou pra dentro e recebe a Falta.");
    }
}
