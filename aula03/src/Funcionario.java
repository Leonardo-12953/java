public abstract class Funcionario {
    protected String nome;

    public void exibirNome(){
        System.out.println("Nome: "+ nome);
    }

    public abstract double calcularSalario();

    
}
