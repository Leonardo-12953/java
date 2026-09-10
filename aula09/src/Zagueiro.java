public class Zagueiro extends  Jogador {


    public  Zagueiro(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    @Override
    public void jogar() {
        System.out.println("Zagueiro: "+ getNome() +" Camisa n°: "+ getNumeroCamisa());
    }
}
