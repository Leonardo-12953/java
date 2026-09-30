public  class Cliente extends Pessoa {
    private String cpf;

    public Cliente (String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public void realizarPedido() {
        System.out.println("Função realizar pedido ativada.");
    }
}      
