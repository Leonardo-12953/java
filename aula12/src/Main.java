public class Main {
    public static void main(String[] args) {
        GestaoFaculdade admin = new GestaoFaculdade();

        Aluno aluno1 = new Aluno("Leo", "123", "naruto@gmail.com");

        System.out.println("=== TESTANDO O SET (E-MAILS ÚNICOS) ===");
        admin.cadastrarEmail(aluno1.getEmail());
        admin.cadastrarEmail("naruto@gmail.com"); 

        System.out.println("\n=== TESTANDO O MAP (MATRÍCULA -> ALUNO) ===");
        admin.matricularAluno(aluno1);

        // Busca direto no Map sem precisar usar 'for'
        Aluno alunoEncontrado = admin.buscarPorMatricula("123");

        if (alunoEncontrado != null) {
            alunoEncontrado.exibirDados();
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}