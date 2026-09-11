import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> elenco;

    public Time(String nome) {
        this.nome = nome;
        this.elenco = new ArrayList<>();
    }

    public void escalar(Jogador j) {
        elenco.add(j);
    }
    public  void escalarVarios(List<Jogador> novos) {
        elenco.addAll(novos);
    }

    public void expulsar(int numeroCamisa) throws JogadorNaoEncontradoException {
        boolean existe = elenco.stream().anyMatch(j -> j.getNumeroCamisa() == numeroCamisa);

        if (!existe) {
            throw new JogadorNaoEncontradoException("Não foi possível expulsar: Jogador com a camisa "+ numeroCamisa +" não foi encontrado no elenco!");
        }

        elenco.removeIf(jogador -> jogador.getNumeroCamisa() == numeroCamisa);
    }



    public void listarElenco() {
        System.out.println("\n-- Elenco do "+ nome +" --");
        for (Jogador j : elenco) {
            j.jogar();
        }
    }



}
