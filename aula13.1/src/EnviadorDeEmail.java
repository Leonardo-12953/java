public class EnviadorDeEmail implements Runnable{
    private String email;
    private String mensagem;

    public EnviadorDeEmail (String email, String mensagem) {
        this.email = email;
        this.mensagem = mensagem;
    }

    @Override
    public void run() {
    
        System.out.println("Iniciando envio de e-mail para: "+ email);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("O envio do e-mail para " + email + " foi interrompido!");
            return;
        } 
        System.out.println("\nE-mail enviado com sucesso! \nDe: Leonardo Company \nPara: "+ email +"\nEu Leonardo Company comunico ao destinatário.\n"+ mensagem);
    }
}
