package aula19;

public class Main {
    public static void main(String[] args) {
        ProdutoDigital pDigital = new ProdutoDigital("GTA VI", 499.99, "simulandoLinkDowload_hahah%4&$¨*@#23kkkk");

        ProdutoFisico pFisico = new ProdutoFisico("Dipirona 1G", 25.00, 5.00);


        System.out.println("\n** Desafío do Gemini **");
        System.out.println("\n-> Produto fisíco");
        System.out.println("Produto: "+ pFisico.getNome() +"\nPreço do Produto: R$ "+ pFisico.getPreco() +"\nTaxa entrega: R$ "+ pFisico.getTaxaEntrega());
        System.out.println("Preço Total: R$ "+ pFisico.calcularPrecoFinal());

        System.out.println("\n-> Produto ditital");
        System.out.println("Produto: "+ pDigital.getNome() +"\nPreço Produto: R$ "+ pDigital.getPreco() +"\nLink Dowload: "+ pDigital.getLinkDownload());
        System.out.println("Preço total: R$ "+ pDigital.calcularPrecoFinal());

    }
}