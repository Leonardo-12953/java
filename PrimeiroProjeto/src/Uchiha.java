public class Uchiha extends Ninja {

    public void sharinganAtivado() {
        System.out.println("Sharingan Ativado!");
    }


    public void usarHabilidadeChakra(int nivelDeChakra) {
        if (nivelDeChakra >= 2) {
            System.out.println("Consigo ativar Sharingan e ainda Usar o Susanoo!");
        } else if (nivelDeChakra == 1) {
            System.out.println("Eu só consigo ativar o Sharingan!");
        } else {
            System.out.println("Eu tô sem chakra. Não consigo ativar o Sharingan!");
        }
    }

    public String getNivelSharingan(int nivel) {
        return switch (nivel) {
            case 1 -> "Sharingan de 1 Tomoe\nA forma inicial mais fraca.\nMostra um pequeno símbolo de vírgula (tomoe) ao redor da pupila. Dá uma percepção básica de movimento.";
            case 2 -> "Sharingan de 2 Tomoes\nA fase intermediária com duas marcas.\nAumenta a capacidade de prever os ataques do inimigo e copiar Jutsus simples.";
            case 3 -> "Sharingan de 3 Tomoes\nO Sharingan maduro e completo. Possui três marcas.\nPermite ver o fluxo de chakra, ler movimentos complexos, usar genjutsus avançados e copiar técnicas com alta precisão.";
            case 4 -> "Mangekyou Sharingan\nA evolução que desperta após um trauma emocional profundo.\nAltera o formato da pupila de forma única para cada usuário e concede poderes especiais (como Kamui, Amaterasu ou Tsukuyomi), além de liberar o Susanoo.\nO uso contínuo causa cegueira.";
            case 5 -> "Mangekyou Sharingan Eterno\nA forma final do olho obtida ao transplantar o Mangekyou Sharingan de um parente próximo.\nResolve o problema da perda de visão e garante o uso ilimitado dos poderes oculares.";
            default -> "Erro!! Nível não detectado.";
        };
    }
}