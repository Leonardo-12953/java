import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        Time flamengo = new Time("Flamengo");
        Time realMadrid = new Time("Real Madrid");
        Time selecaoaBrasileira = new Time("Seleção Brasileira");


        // Escalar um por vez
        flamengo.escalar(new Atacante("Bruno Henrique",27));

        // Escalar varios de uma só vex por time.
        flamengo.escalarVarios(List.of(
            new Atacante("Luiz Araújo", 7),
            new Atacante("Pedro", 9),
            new Atacante("Samuel Lino", 16),
            new Zagueiro("Léo Ortiz", 3),
            new Zagueiro("Léo Pereira", 4)
        ));

        realMadrid.escalarVarios(List.of(
            new Atacante("Kilian Mbappe", 10),
            new Atacante("Vini jr", 7),
            new Zagueiro("Militão", 3)
        ));

        selecaoaBrasileira.escalarVarios(List.of(
            new Atacante("Neymar jr", 10),
            new Atacante("Endrick", 9),
            new Zagueiro("Marquinhos", 3)
        ));

        // Flamengo
        flamengo.listarElenco();
        try {
            System.out.println("\nExpulsando jogador do elenco....");
            flamengo.expulsar(6);
            System.out.println("Jogador Expulso !!");
        } catch (JogadorNaoEncontradoException excep) {
            System.out.println("Erro: "+ excep.getMessage());
        }
        flamengo.listarElenco();

        // Real Madrid
        realMadrid.listarElenco();
        try {
            System.out.println("\nExpulsando jogador do elenco....");
            realMadrid.expulsar(10); 
            System.out.println("Jogador Expulso !!"); 
        } catch (JogadorNaoEncontradoException excep) {
            System.out.println("Erro: "+ excep.getMessage());
        }
        realMadrid.listarElenco();

        // Seleção Brasileira
        selecaoaBrasileira.listarElenco();
        try {
            System.out.println("\nExpulsando jogador do elenco....");
            selecaoaBrasileira.expulsar(3);
            System.out.println("Jogador Expulso !!");
        } catch (JogadorNaoEncontradoException excep) {
            System.out.println("Erro: "+ excep.getMessage());
        }
        selecaoaBrasileira.listarElenco();











    }
}
