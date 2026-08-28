public class Hyuga extends Ninja {
    private int danoJuuken;
    private boolean byakuganAtivado;
    
    public boolean isByakuganAtivado() {
        return byakuganAtivado;
    }
    public void setByakuganAtivado(boolean byakuganAtivado) {
        this.byakuganAtivado = byakuganAtivado;
    }
    
    public int getDanoJuuken() {
        return danoJuuken;
    }
    public void setDanoJuuken(int danoJuuken) {
        this.danoJuuken = danoJuuken;
    }


    public void usarJuuken(int quantidadeDeGolpes){
        int danoTotal = this.danoJuuken * quantidadeDeGolpes;

        if (isByakuganAtivado()){
            System.out.println("Atacando os tenketsu com Jũken! "+ quantidadeDeGolpes +" golpes aplicados.");
            System.out.println("Causando dano de: "+ danoTotal);
            System.out.println("O fluxo de chakra do oponente foi bloqueado!");
        } else {
            int danoReduzido = danoTotal / 2;
            System.out.println("Atacando com Jũken básico (Sem o Byakugan). Dano reduzido para: "+ danoReduzido);
        }
    }

}
