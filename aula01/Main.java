public class Main {

    public static void main(String[] args) {

        //obj 1 kkkk loucura total
        aluno estudante = new aluno();
        estudante.setNome("Leonardo");
        estudante.setIdade(15);
        estudante.setSerie("5° Série ou 6° ano.");
        estudante.setResponsavel("Tânia Maria");

        // obj 2
        professor professor = new professor();
        professor.setNome("Eduardo Cabral"); // Aqui eu dei um setNome, pra testar, pra ver se conseguiria usar o nome diferente e não roubar o nome do estudante. só teste mesmo. eu antes tinha feito o setProfe que criei na classe professor kkkk, fiz do meu jeito.
        professor.setMateria("Programação");

        System.out.println("\n--- Apresentação do Aluno---\n");
        System.out.println("Nome do aluno: "+ estudante.getNome());
        System.out.println("Idade: "+ estudante.getIdade());
        System.out.println("Responsavel: "+ estudante.getResponsavel());
        System.out.println("Série: "+ estudante.getSerie());
        System.out.println("Professor: "+ professor.getNome());
        System.out.println("Matéria: "+ professor.getMateria());
    }
}