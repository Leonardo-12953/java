public class uchiha extends ninja {

    public void sharinganAtivado() {
        System.out.println("Sharingan Ativado");
    }

    @Override
    public void ataqueBase() {
        System.out.println("Eu sou um ninja e taquei uma Kunai do elemento FOGO.");
    }

    public void ataqueBase(int nivelDeChakra) {

        if (nivelDeChakra >= 2) {
            System.out.println("Susano ativado");
        } else if (nivelDeChakra <= 1) {
            System.out.println("Eu só consegui ativar o sharingan");
        } else {
            System.out.println("Eu to sem chakra");
        }
    }

    public String nivelSharingan(int nivel) {
        if (nivel == 1) {
            return "Sharingan de 1 Tomoe \nA forma inicial mais fraca.\nMostra um pequeno símbolo de vírgula (tomoe) ao redor da pupila. Dá uma percepção básica de movimento.\n";

        } else if (nivel == 2){
           return "Sharingan de 2 Tomoes \nA fase intermediária com duas marcas.\nAumenta a capacidade de prever os ataques do inimigo e copiar Jutsus simples.\n";
            
        }else if (nivel == 3) {
           return "Sharingan de 3 Tomoes \nO Sharingan maduro e completo. Possui três marcas.\nPermite ver o fluxo de chakra, ler movimentos complexos, usar genjutsus avançados e copiar técnicas com alta precisão.\n";
            
        }else if (nivel == 4) {
           return "Mangekyou Sharingan \nA evolução que desperta após um trauma emocional profundo ou perda de alguém querido.\nAltera o formato da pupila de forma única para cada usuário e concede poderes especiais (como Kamui, Amaterasu ou Tsukuyomi), além de liberar o Susanoo.\nO uso contínuo causa cegueira.\n";
            
        }else if (nivel == 5) {
            return "Mangekyou Sharingan Eterno \nA forma final do olho obtida ao transplantar o Mangekyou Sharingan de um parente próximo (geralmente um irmão).\nResolve o problema da perda de visão e garante o uso ilimitado dos poderes oculares.\n";
             
        }
        else {
            return "Erro !! nivel não detectado.";
        }
    }

}

// Informação abaixo foi baseada no tikToker (felipe.lombardi).
