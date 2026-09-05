import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> elenco;

    public Time(String nome) {
        this.nome = nome;
        this.elenco = new ArrayList<>();
    }

    public void escalar(Jogador jogador) {
        elenco.add(jogador);
        System.out.println(jogador.getNome() + " foi escalado no " + nome + "!");
    }

    public void listarElenco() {
        System.out.println("\n-- Elenco do " + nome + " --");
        for (Jogador jogador : elenco) {
            jogador.jogar();
        }
    }
}