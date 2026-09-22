public class TarefaSaque implements  Runnable{
    private ContaBancaria conta;
    private String nomeCliente;

    public TarefaSaque(ContaBancaria conta, String nomeCliente) {
        this.conta = conta;
        this.nomeCliente = nomeCliente;
    }

    @Override
    public void run() {
        conta.sacar(100.0, nomeCliente);
    }
}
