public class Moto extends Veiculo{
    private boolean usarCapacete;

    public void setUsarCapacete(boolean usarCapacete) {
        this.usarCapacete = usarCapacete;
    }
    public boolean isUsarCapacete() {
        return usarCapacete;
    }

    public void empinar(){
        System.out.println("Empinando a moto: Veículo se equilibra sobre a roda traseira da moto, e dianteira fica no ar.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando... Ran dan dan dan dannnnnnn");
    }

    public void acelerar(int velocidade, String marcha) {
        System.out.println("Moto acelerando a "+ velocidade +"km/h ! engatada na "+ marcha +" marcha.");
    }

}
