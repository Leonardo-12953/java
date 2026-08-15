public class aluno extends pessoa{
    
    private String responsavel;
    private String serie;

    // permitir que sejam setados usando getter e setter

    // getter
    public String getResponsavel() {
        return responsavel;
    }
    public String getSerie() {
        return serie;
    }

    // setter
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
}
