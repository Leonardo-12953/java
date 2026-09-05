public class Main {
    public static void main(String[] args) {

        Time flamengo = new Time("Flamengo");
        Time realMadrid = new Time("Real Madrid");

        flamengo.escalar(new Atacante("Bruno Henrique", 27));
        flamengo.escalar(new MeioCampo("Giorgian Arrascaeta", 10));
        flamengo.escalar(new Volante("Erick Pulgar", 5));

        realMadrid.escalar(new Volante("Frederico Valverde", 8));
        realMadrid.escalar(new Atacante("Vinicius Jr", 7));
        realMadrid.escalar(new MeioCampo("Jude belighan", 5));


        flamengo.listarElenco();
        realMadrid.listarElenco();
    }
}