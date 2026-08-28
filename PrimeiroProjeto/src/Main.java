public class Main {
    public static void main(String[] args) {
        
        //Instanciando as shurikens
        Shuriken hirashuriken = new Shuriken(10, 1);
        Shuriken boshuriken = new Shuriken(15, 2);
        Shuriken rasenshuriken = new Shuriken(9999,  3);
         
        //Instanciando a Kunai
        Kunai kunai = new Kunai(50, true);


        // objeto 1 Naruto
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



        // obj 2 Sasuke
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


        // obj 3 Sakura
        Haruno sakura = new Haruno();
        sakura.setNome("Sakura Haruno");
        sakura.setAldeia("Folha");
        sakura.setIdade(17);
        sakura.setTemByakugou(true);
        sakura.setNivelNinjutsuMedico(1000);
        sakura.setForcaBruta(5000);


        // mostrar na tela a Sakura
        System.out.println("\nNinja: "+ sakura.getNome());
        System.out.println("Aldeia: "+ sakura.getAldeia());
        System.out.println("Idade: "+ sakura.getIdade());
        System.out.println("Têm Byakugou: "+ sakura.isTemByakugou());
        System.out.println("Nível ninjutsu médico: "+ sakura.getNivelNinjutsuMedico());
        System.out.println("Força bruta: "+ sakura.getForcaBruta());
        System.out.println("Preciso distrair o inimigo para curar meu aliado.");
        hirashuriken.usarArma();
        System.out.println("Consegui!! vou iniciar a cura");
        sakura.curarParceiro();
        System.out.println("O inimigo está vindo... Vou atacar ele ...");
        sakura.impactoMonstruoso();
        

        // obj 4 Hinata
        Hyuga hinata = new Hyuga();
        hinata.setNome("Hinata Hyuga");
        hinata.setAldeia("Folha");
        hinata.setIdade(16);
        hinata.setByakuganAtivado(true);
        hinata.setDanoJuuken(100);

        // mostrar na tela a Hinata
        System.out.println("\nNome: "+ hinata.getNome());
        System.out.println("Aldeia: "+ hinata.getAldeia());
        System.out.println("Idade: "+ hinata.getIdade());
        System.out.println("Byakugan ativado: "+ hinata.isByakuganAtivado());
        System.out.println("Dano Juken: "+ hinata.getDanoJuuken());
        System.out.println("Inimigo avistado. vou atacar com uma kunai..");
        kunai.usarArma();
        System.out.println("La vou eu de novo.....");
        hinata.usarJuuken(64);
        System.out.println("Acho que com esse ataque o inimigo não vai se levantar... ");



    
    }
        
    
}
