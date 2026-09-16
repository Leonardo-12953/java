public class Main {
    public static void main(String[] args) {
        Pix pix = new Pix();
        CartaoCredito cartaoCredito = new CartaoCredito();

        System.out.println("1) Testando pagamento pix ");
        pix.processarPagamento(500.0);
        System.out.println("\n2) Testando Pagamento Cartão Crédito");
        cartaoCredito.processarPagamento(300.0);

    }
}
