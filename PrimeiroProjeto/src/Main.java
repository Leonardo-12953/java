public class Main {
    public static void main(String[] args) {
        
        
        // objeto 1
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.setAldeia("Folha");
        naruto.setIdade(17);
        naruto.temBiju = true;
        
        // mostra na tela o Naruto
        System.out.println("\nNinja: " + naruto.getNome());
        System.out.println("Aldeia: "+ naruto.getAldeia());
        System.out.println("Idade: " + naruto.getIdade());
        System.out.println("Têm Biju: " + naruto.temBiju);
        naruto.ataqueBase();



        // obj 2
        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.setAldeia("Folha");
        sasuke.setIdade(17);

        // mostra na tela o Sasuke
        System.out.println("\nNinja: " + sasuke.getNome());
        System.out.println("Aldeia: "+ sasuke.getAldeia());
        System.out.println("Idade: " + sasuke.getIdade());
        sasuke.sharinganAtivado();
        sasuke.ataqueBase(1);
        System.out.println("Nivel Sharingan: " + sasuke.nivelSharingan(5));
        
    }
        
    
}
