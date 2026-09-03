public class Main {
    public static void main(String[] args) {
        Zagueiro zagueiro = new Zagueiro("Léo Pereira", 3);

        MeiaAtacante meiaAtacante = new MeiaAtacante("Neymar jr", 10);

        Atacante atacante = new Atacante("Pedro", 9);

        System.out.println("\n--Narrando uma jogada em Java --");
        System.out.println("\nLá vem cruzamento na área.. ");
        zagueiro.jogar();
        meiaAtacante.jogar();
        atacante.jogar();
        System.out.println("Falta perigosa na entrada da área, eu não sei não em junior(comentarista do jogo) mas dessa distância pode sair o gol.");
        System.out.println("Junior: 'é Luiz, marcador deu bobeira, e agora corre esse risco de sofrer um gol, e acabar prejudicando o seu time.'");
        meiaAtacante.cobrarFalta();
        System.out.println("GooLLL GooLLL GooLLL!!!");
        
    }
}
