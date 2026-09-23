package aula16;

public class Ninja {
    private int id;
    private String nome;
    private String aldeia;
    private String clan;

    public Ninja() {}

    // Construtor para criar novos Ninjas (sem ID, pois o banco gera o ID sozinho)
    public Ninja(String nome, String aldeia, String clan) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.clan = clan;
    }

    public Ninja(int id, String nome, String aldeia, String clan) {
        this.id = id;
        this.nome = nome;
        this.aldeia = aldeia;
        this.clan = clan;
    }

    // getters e setters
    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setAldeia(String aldeia) { this.aldeia = aldeia; }
    public void setClan(String clan) { this.clan = clan; }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getAldeia() { return aldeia; }
    public String getClan() { return clan; }

}
