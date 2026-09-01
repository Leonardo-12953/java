public class Main {
    public static void main(String[] args) {

        //obj 1
        PagamentoCartao pgCartao = new PagamentoCartao();
        pgCartao.valor = 200.0;

        //obj 2
        PagamentoPix pgPix = new PagamentoPix();
        pgPix.valor = 50.0;

        // mostrar o dois na tela

        System.out.println("\n-- Desafio de Pagamento Gemini --\n");
        System.out.println("Primeiro teste: ");
        pgCartao.processarPagamento();
        System.out.println("\nSegundo teste: ");
        pgCartao.processarPagamento(200.0, 5);
        System.out.println("\nTerceiro teste: ");
        pgPix.processarPagamento();
        System.out.println("\nTeste finalizado com sucesso !!");
        
        
    }
}
