public class Main {
    public static void main(String[] args) {
        
        Thread teste1Email = new Thread(new EnviadorDeEmail("fulano@gmail.com", "Atenção!! Você foi sorteado com um prêmio de Mil dolares!") );
        

        Thread teste2Email = new Thread(new EnviadorDeEmail("bertrano@outlook.com", "Você foi demetido, agradecemos os serviços prestados."));

        Thread teste3Email = new Thread(new EnviadorDeEmail("circlano@hotmail.com", "Você foi selecionado para o cargo de Gerente! "));

        
        teste1Email.start();
        teste2Email.start();
        teste3Email.start();
        
        System.out.println("Todos os disparos foram solicitados! ");


    }
}
