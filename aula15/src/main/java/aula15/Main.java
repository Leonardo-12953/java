package aula15;

public class Main {
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();
        dao.criarTabela();

        // Criando e salvando um cliente
        Cliente c1 = new Cliente("Leonardo", "leonardo@email.com");
        dao.salvar(c1);

        // Listando todos os clientes
        System.out.println("\n--- LISTA DE CLIENTES ---");
        for (Cliente cliente : dao.listar()) {
            System.out.println("ID: " + cliente.getId() + 
                               " | Nome: " + cliente.getNome() + 
                               " | Email: " + cliente.getEmail());
        }
    }
}