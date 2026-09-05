import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Jogador> elenco = new ArrayList<>();
        elenco.add(new Atacante("Bruno Henrique", 27));
        elenco.add(new Zagueiro("Léo Ortiz", 3));
        elenco.add(new MeioCampista("Giorgian Arrascaeta", 10));

        System.out.println("\n-- Escalação --\n");
        for (Jogador jogador : elenco) {
            jogador.jogar();
        }
        
        System.out.println("\nDesafios do gemini: ");
        System.out.println("\n            ** Total de Jogadores: "+ elenco.size());
        System.out.println("\nEncontrar por indice(): ");
        System.out.println("Nome do jogador no indice (0): "+ elenco.get(0).getNome());
        System.out.println("Nome do jogador no indice (1): "+ elenco.get(1).getNome());
        System.out.println("Nome do jogador no indice (2): "+ elenco.get(2).getNome());

        System.out.println("\nEcontrar pelo numero da camisa: ");
        int camisaProucurada = 10;
        for (Jogador jogador : elenco) {
            if (jogador.getNumeroCamisa() == camisaProucurada) {
               System.out.println("Camisa: "+ camisaProucurada +" encontrado: "+ jogador.getNome());
            }
        }

        System.out.println("\nExpulsar 1 jogador: ");
        elenco.remove(1);
        System.out.println("Jogador removido do elenco !");
        System.out.println("          ** Total de jogadores no elenco: "+ elenco.size());

    }
}
