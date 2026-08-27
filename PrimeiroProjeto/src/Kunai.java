public class Kunai extends Arma {
    private boolean temPapelBomba;

    public Kunai(int danoBase, boolean temPapelBomba) {
        super("Kunai", danoBase); // chama a arma
        this.temPapelBomba = temPapelBomba;
    }

    @Override
    public void usarArma() {
        System.out.println("A Kunai foi perfurando o adversário! Dano: "+ getDanoBase());
        if (temPapelBomba) {
            System.out.println("BOOM!! O papel bomba explodiu!");
        }
    }
}
