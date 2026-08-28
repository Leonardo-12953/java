public class Haruno extends Ninja {
    private boolean temByakugou;
    private int nivelNinjutsuMedico;
    private int forcaBruta;

    public boolean isTemByakugou() {
        return temByakugou;
    }
    public void setTemByakugou(boolean temByakugou) {
        this.temByakugou = temByakugou;
    }

    public int getNivelNinjutsuMedico() {
        return nivelNinjutsuMedico;
    }
    public int getForcaBruta() {
        return forcaBruta;
    }
    public void setNivelNinjutsuMedico(int nivelNinjutsuMedico) {
        this.nivelNinjutsuMedico = nivelNinjutsuMedico;
    }
    public void setForcaBruta(int forcaBruta) {
        this.forcaBruta = forcaBruta;
    }

    public void curarParceiro(){
        System.out.println("Curando... saúde aumentada para " + this.nivelNinjutsuMedico);
    }
    public void impactoMonstruoso(){
        System.out.println("Soco da morteeee !!! causando "+ this.forcaBruta +" de dano ao inimigo.");
    }


}
