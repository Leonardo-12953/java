package aula17;

public class Main {
    public static void main(String[] args) {
        NinjaDAO dao = new NinjaDAO();

        // dropar tabela pra ficar zerada pronta pra uso.
        dao.droparTabela();

        // criar a tabela
        dao.criarTabela();

        // criando ninjas
        Ninja n1 = new Ninja("Naruto Uzumaki", "Folha", "Uzumaki");
        Ninja n2 = new Ninja("Sasuke Uchiha", "Folha", "Uchiha");
        Ninja n3 = new Ninja("Gaara", "Areia", "Kazekage");
        Ninja n4 = new Ninja("Killer Bee", "Nuvem", "Yotsuki");

        
        System.out.println("\n--- CADASTRANDO NINJAS ---");
        dao.salvar(n1);
        dao.salvar(n2);
        dao.salvar(n3);
        dao.salvar(n4);
        
        // buscar por id
        Ninja ninjaEncontrado = dao.buscarPorId(1);
            System.out.println("\n--- SELECIONADO POR ID ---");
            if (ninjaEncontrado != null) {
                System.out.println("Ninja encontrado: " + ninjaEncontrado.getNome());
            } else {
                System.out.println("Ninja não encontrado!");
            }

        // listar nossos ninjas brabos
        System.out.println("\n--- REGISTROS DE NINJAS DO BANCO DE DADOS ---");
        for (Ninja ninja : dao.listar()) {
            System.out.println("ID: "+ ninja.getId() +
            " | Nome: "+ ninja.getNome() +
            " | Aldeia: "+ ninja.getAldeia() +
            " | Clan: "+ ninja.getClan());
        }
        System.out.println("");// deixe vazio pra pular 1 linha só.
        
        // Atualizar o  ninja
        Ninja update = new Ninja(3,"Ninja Atualizado", "Areia", "Putifero");
        dao.atualizar(update);

        // deletar um ninja
        dao.deletar(4);

        // listar novamente pra atualizar a lista.
        System.out.println("\n-- LISTA ATUALIZADA --");
        for (Ninja ninja : dao.listar()) {
            System.out.println("ID: "+ ninja.getId() +
            " | Nome: "+ ninja.getNome() +
            " | Aldeia: "+ ninja.getAldeia() +
            " | Clan: "+ ninja.getClan());
        }

        System.out.println("\n** Produzido por Leonardo dos Santos **");
    }
}