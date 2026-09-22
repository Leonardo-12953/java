public class ContaBancaria {
    private double saldo = 100;

    public synchronized void sacar(double valor, String nomeCliente) {
        System.out.println(nomeCliente +" está tentando sacar R$ "+ valor +" | Saldo atual: "+ saldo);

        if (saldo >= valor) {
            System.out.println("--> "+ nomeCliente +" teve o saque APROVADO. Processando...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saldo -= valor;
            System.out.println("--> Saque concluído! Novo saldo: R$ "+ saldo +"\n");
        } else {
            System.out.println("X "+ nomeCliente +" teve o saque NEGADO! saldo insuficiente (R$ "+ saldo +")\n");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
