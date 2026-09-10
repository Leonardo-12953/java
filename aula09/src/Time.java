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

    public void expulsar(int numeroCamisa) {
        elenco.removeIf(jogador -> jogador.getNumeroCamisa() == numeroCamisa);
    }


    // Se quiser mostrar quem foi o expulso.
    /*public void expulsar(int numeroCamisa) {
        for (Jogador jogador : elenco) {
            if (numeroCamisa == jogador.getNumeroCamisa()) {
                elenco.remove(jogador);
                System.out.println("Jogador "+ jogador.getNome() +" removido do elenco.");
                break;
            }
        }
    }*/



    public void listarElenco() {
        System.out.println("\n-- Elenco do "+ nome +" --");
        for (Jogador j : elenco) {
            j.jogar();
        }
    }



}
