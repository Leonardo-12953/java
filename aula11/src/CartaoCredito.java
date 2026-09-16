public class CartaoCredito implements Pagamento {

    public CartaoCredito() {
    
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Simulando validação do cartão de Crédito");
    }
}
