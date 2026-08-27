public class Shuriken extends Arma {
    private int tipoDeShuriken;

    public Shuriken(int danoBase, int tipoDeShuriken) {
        super("Shuriken", danoBase);
        this.tipoDeShuriken = tipoDeShuriken;
    }

    @Override
    public void usarArma() {
        if (tipoDeShuriken == 1) {
            System.out.println("Lancei a Hira-shuriken (lâmina em formato de estrela) para distrair o oponente!");
            System.out.println("Dano causado: " + getDanoBase());
        } else if (tipoDeShuriken == 2) {
            System.out.println("Usei a Bo-shuriken (haste metálica pontiaguda) em combate direto!");
            System.out.println("Dano causado: " + getDanoBase());
        } else if (tipoDeShuriken == 3) {
            System.out.println("Segura esse Rasenshuriken (Rasengan com estilo vento se tornando uma shuriken de chakra gigante) em combate direto!");
            System.out.println("Dano causado: " + getDanoBase());
        } else {
            System.out.println("Lancei uma Shuriken comum causando Dano: " + getDanoBase());
        }
    }
}