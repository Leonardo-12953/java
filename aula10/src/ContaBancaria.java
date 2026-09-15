public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor <= 0) {
            // IllegalArgumentException é uma exceção nativa do Java para argumentos inválidos!
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero!");
        }
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero!");
        }
        if (valor > saldo) {
            // Dispara a nossa exceção customizada!
            throw new SaldoInsuficienteException("Saldo insuficiente! Você tentou sacar R$ " + valor + ", mas tem apenas R$ " + saldo);
        }
        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo Atual: R$ " + saldo);
    }
}