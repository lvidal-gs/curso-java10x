package NivelIntermediario.Desafios.Desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    protected void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

    public void exibirInformacoes() {
        System.out.println("\n====== Informações do Ninja ======");
        System.out.println("Nome do ninja: " + nome.toUpperCase());
        System.out.println("Habilidade especial: " + habilidadeEspecial);
        System.out.println("Idade: " + idade);
        System.out.printf("Missão: %s (Nível %s) \n", missao.toUpperCase(), nivelDificuldade.toUpperCase());
        System.out.println("Status da missão: " + statusMissao);
    }

}
