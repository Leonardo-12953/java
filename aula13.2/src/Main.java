public class Main {
    public static void main(String[] args) {
        
        ContaBancaria contaCompartilhada = new ContaBancaria();

        Thread t1 = new Thread(new TarefaSaque(contaCompartilhada, "Leonardo"));
        Thread t2 = new Thread(new TarefaSaque(contaCompartilhada, "Yasmin"));

        t1.start();
        t2.start();
    }
}
