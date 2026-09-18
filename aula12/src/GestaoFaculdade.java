import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GestaoFaculdade {

    // 1. O Set guarda apenas chaves/valores ÚNICOS (nesse caso, e-mails de alunos)
    private Set<String> emailsCadastrados;

    // 2. O Map guarda pares de CHAVE -> VALOR (Chave: Matrícula String | Valor: Objeto Aluno)
    private Map<String, Aluno> mapaAlunos;

    // Construtor: inicializamos o HashSet e o HashMap aqui
    public GestaoFaculdade() {
        this.emailsCadastrados = new HashSet<>();
        this.mapaAlunos = new HashMap<>();
    }

    // --- MÉTODOS PARA O SET (Conjunto de E-mails Únicos) ---

    public void cadastrarEmail(String email) {
        // O método .add() do Set tenta inserir o item.
        // Se o e-mail NÃO existir no Set, ele adiciona e retorna true.
        // Se o e-mail JÁ existir, ele ignora e retorna false.
        boolean adicionou = emailsCadastrados.add(email);

        if (adicionou) {
            System.out.println("[SET] E-mail cadastrado com sucesso: " + email);
        } else {
            System.out.println("[SET ERRO] O e-mail " + email + " já está cadastrado no sistema!");
        }
    }

    // --- MÉTODOS PARA O MAP (Mapeamento Matrícula -> Aluno) ---

    public void matricularAluno(Aluno aluno) {
        // O método .put(chave, valor) insere a dupla no mapa.
        // Usamos a matrícula do aluno como a CHAVE de busca.
        mapaAlunos.put(aluno.getMatricula(), aluno);
        System.out.println("[MAP] Aluno " + aluno.getNome() + " matriculado sob a chave: " + aluno.getMatricula());
    }

    public Aluno buscarPorMatricula(String matricula) {
        // O método .get(chave) busca DIRETO no mapa sem precisar de um laço 'for'!
        // Se encontrar a chave, retorna o Aluno. Se não achar, retorna null.
        return mapaAlunos.get(matricula);
    }
}