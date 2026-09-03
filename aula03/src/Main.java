public class Main {
    public static void main(String[] args) {
        
        Dev dev = new Dev("Leonardo Dos Santos", 2500.0);

        Vendedor vendedor = new Vendedor("Yasmin Kathelyn", 1500., 900.0);
        
        //Deixei os nomes de 2 formas de proposito.
        System.out.println("\n-- Dev --\n"+ dev.nome);
        System.out.println("Salário: R$ "+ dev.calcularSalario());
        
        System.out.println("\n-- Vendedor --\n"+ vendedor.nome);
        System.out.println("Salario Base: R$ "+ vendedor.getSalarioBase());
        System.out.println("Comisão: R$ "+ vendedor.getComissao());
        System.out.println("Salario total: R$ "+ vendedor.calcularSalario());
        
    }
}
