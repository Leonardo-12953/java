public class ninja {
    private String nome;
    private String aldeia;
    private int idade;


    /* Getter */
    public String getNome() {
        return nome;
    }
    public String getAldeia() {
        return aldeia;
    }
    public int getIdade() {
        return idade;
    }


    /* Setter */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void ataqueBase() {
        System.out.println("Eu sou um ninja e taquei uma kunai");
    }
}
