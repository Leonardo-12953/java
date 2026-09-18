public class Aluno {
    private String matricula;
    private String nome;
    private String email;
    
    public Aluno (String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public void setEmail(String email) {this.email = email;} public void setMatricula(String matricula) {this.matricula = matricula;} public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;} public String getMatricula() {return matricula;} public String getNome() {return nome;}

    public void exibirDados () {
        System.out.println("-- Dados do Aluno --");
        System.out.println("\nNome: "+ nome);
        System.out.println("Matrícula: "+ matricula);
        System.out.println("Email: "+ email);
        
    }


}
