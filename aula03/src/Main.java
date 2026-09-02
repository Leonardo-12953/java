public class Main {
    public static void main(String[] args) {
        Dev dev = new Dev();
        dev.nome = "Leonardo Dos Santos";
        
        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Yasmin kathelyn";
        
        dev.setSalarioFixo(3000.0);
        vendedor.setSalarioBase(1500.0);
        vendedor.setComissao(900.0);
        

        //Deixei os nomes de 2 formas de proposito.
        System.out.println("\n-- Dev --\n"+ dev.nome);
        dev.exibirNome();
        System.out.println("Salário: R$ "+ dev.calcularSalario());
        
        System.out.println("\n-- Vendedor --\n"+ vendedor.nome);
        vendedor.exibirNome();
        System.out.println("Salario Base: R$ "+ vendedor.getSalarioBase());
        System.out.println("Comisão: R$ "+ vendedor.getComissao());
        System.out.println("Salario total: R$ "+ vendedor.calcularSalario());
        
    }
}
