public class Main {
    public static void main(String[] args) {
        
        //obj 1
        Carro carro = new Carro();
        carro.setModelo("Ka");
        carro.setMarca("Ford");
        carro.setAno(2015);
        carro.setCor("Prata");
        carro.setUsarCintoSeguranca(true);

        //mostrar na tela
        System.out.println("\n-- Veiculos --");
        System.out.println("\nMarca: "+ carro.getMarca());
        System.out.println("Modelo: "+ carro.getModelo());
        System.out.println("Ano: "+ carro.getAno());
        System.out.println("Cor: "+ carro.getCor());
        System.out.println("Obrigatório uso de cinto: "+ carro.isUsarCintoSeguranca());



        //obj 2
        Moto moto = new Moto();
        moto.setModelo("CG 150");
        moto.setMarca("Honda");
        moto.setAno(2015);
        moto.setCor("Azul");
        moto.setUsarCapacete(true);

        //mostrar na tela
        System.out.println("\nMarca: "+ moto.getMarca());
        System.out.println("Modelo: "+ moto.getModelo());
        System.out.println("Ano: "+ moto.getAno());
        System.out.println("Cor: "+ moto.getCor());
        System.out.println("Obrigatório uso de capacete: "+ moto.isUsarCapacete());
        System.out.println("Vou fazer uma manobra pra demostrar minha habilidade !");
        moto.empinar();


    }
}
