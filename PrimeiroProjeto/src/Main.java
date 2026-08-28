public class Main {
    public static void main(String[] args) {
        
        //Instanciando as shurikens
        Shuriken hirashuriken = new Shuriken(10, 1);
        Shuriken boshuriken = new Shuriken(15, 2);
        Shuriken rasenshuriken = new Shuriken(9999,  3);
        
        // objeto 1
        Uzumaki naruto = new Uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.setAldeia("Folha");
        naruto.setIdade(17);
        naruto.setTemBiju(true);
        
        // mostra na tela o Naruto
        System.out.println("\nNinja: " + naruto.getNome());
        System.out.println("Aldeia: "+ naruto.getAldeia());
        System.out.println("Idade: " + naruto.getIdade());
        System.out.println("Têm Biju: " + naruto.isTemBiju());
        naruto.ModoSabioAtivado();
        rasenshuriken.usarArma();



        // obj 2
        Uchiha sasuke = new Uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.setAldeia("Folha");
        sasuke.setIdade(17);


        // mostra na tela o Sasuke
        System.out.println("\nNinja: " + sasuke.getNome());
        System.out.println("Aldeia: "+ sasuke.getAldeia());
        System.out.println("Idade: " + sasuke.getIdade());
        sasuke.usarHabilidadeChakra(2);
        sasuke.sharinganAtivado();
        System.out.println("Nível do Sharingan: "+ sasuke.getNivelSharingan(5));
        boshuriken.usarArma();
    
    }
        
    
}
