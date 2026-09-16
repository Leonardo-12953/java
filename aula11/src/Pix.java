public class Pix implements Pagamento {
    
    public  Pix() {
        
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("=======================================");
        System.out.println("        PAGAMENTO VIA PIX        ");
        System.out.println("=======================================\n");
        System.out.println(" ██████████\n" + //
                        "             ██ ██  ██\n" + //
                        "             █  ████ █\n" + //
                        "             ██  ██ ██\n" + //
                        "             ████  ███\n" + //
                        "             ██ ██████\n" + //
                        "             ██████████");
        System.out.println("-----  Código copiar e colar ----- \nASmckaks12s656qsad1253wd512s3a");
        System.out.println("Valor do Pagamento: R$ "+ valor);
    }
}
