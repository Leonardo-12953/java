public class PagamentoPix extends Pagamento{
    private String chavePix;

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
    public String getChavePix() {
        return chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando PIX no valor de R$ "+ valor);
    }
    

}
