import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Jogador> escalacao = new ArrayList<>();
        escalacao.add(new Zagueiro("Léo Pereira", 3));
        escalacao.add(new Zagueiro("Léo Ortiz", 4));
        escalacao.add(new Atacante("Pedro Guilherme", 9));
        escalacao.add(new Atacante("Bruno Henrique", 27));

        System.out.println("\n-- Escalação --\n"); 
        for (Jogador jogador : escalacao) {
            jogador.jogar();
        }

    }
}
