public class PagamentoCartao extends Pagamento {
    private int parcelas;

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    public int getParcelas() {
        return parcelas;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento no Cartão de R$ "+ valor);
    }

    public void processarPagamento(double valor ,int parcelas) {
        double divisao = valor / parcelas;
        System.out.println("Pagamento de R$ "+ valor +" parcelado em "+ parcelas +"x");
        System.out.println("valor da parcela mensal: R$ "+ divisao);
    }
    

}
