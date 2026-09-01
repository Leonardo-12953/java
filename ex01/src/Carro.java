public class Carro extends Veiculo {
    private boolean usarCintoSeguranca;
    
    
    public void setUsarCintoSeguranca(boolean usarCintoSeguranca) {
        this.usarCintoSeguranca = usarCintoSeguranca;
    }

    public boolean isUsarCintoSeguranca() {
        return usarCintoSeguranca;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando... Vruum Vrumm vrumm");
    }

    public void acelerar(int velocidade) {
        System.out.println("Carro acelerando a "+ velocidade +"km/h");
    }

    public void acelerar(int velocidade, String marcha) {
        System.out.println("Carro acelerando a "+ velocidade +"km/h ! engatado na "+ marcha +" marcha.");
    }



}
