public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Carlos", 500.0);

        System.out.println("--- TESTE 1: Operação com erro de Saldo Insuficiente ---");
        executarOperacaoBancaria(conta, 600.0);

        System.out.println("\n--- TESTE 2: Operação com erro de Valor Inválido (Negativo) ---");
        executarOperacaoBancaria(conta, -50.0);

        System.out.println("\n--- TESTE 3: Operação Com Sucesso ---");
        executarOperacaoBancaria(conta, 200.0);
    }

    // Método auxiliar para demonstrar o try/catch/finally
    public static void executarOperacaoBancaria(ContaBancaria conta, double valorSaque) {
        try {
            System.out.println("Iniciando tentativa de saque...");
            conta.sacar(valorSaque);
            conta.exibirSaldo();

        } catch (SaldoInsuficienteException e) {
            // Trata especificamente o erro de falta de saldo
            System.err.println("[ERRO DE NEGÓCIO]: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            // Trata especificamente o erro de valor negativo/inválido (MULTI-CATCH)
            System.err.println("[ERRO DE VALIDAÇÃO]: " + e.getMessage());

        } finally {
            // O FINALLY RODA SEMPRE! Dando erro ou dando tudo certo.
            System.out.println("[FINALLY]: Comprovante impresso / Log de auditoria registrado.");
        }
    }
}