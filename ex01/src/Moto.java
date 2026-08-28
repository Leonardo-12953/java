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

}
