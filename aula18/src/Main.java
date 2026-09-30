public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Leonardo", "leo@email.com", 2000.0);

        Cliente c1 = new Cliente("Joaquin", "joaquin@email.com", "123.154.152-65");

        System.out.println("\n** Testando Funcionario **");
        System.out.println("Nome: "+ f1.getNome() +
                           "\nEmail: "+ f1.getEmail() +
                           "\nSalario: R$ "+ f1.getSalario());
        
        f1.atenderCliente();

        System.out.println("\n** Testando Cliente **");
        System.out.println("Nome: "+ c1.getNome() +
                            "\nEmail: "+ c1.getEmail() +
                            "\nCPF: "+ c1.getCpf());
        c1.realizarPedido();
        
    }
}
