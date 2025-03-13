package NivelIntermediario.Desafios.Desafio3;

public class main {
    public static void main(String[] args) {
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 15;
        Naruto.missao = "Tornar-se Hokage";
        Naruto.nivelDificuldade = "s++";
        Naruto.statusMissao = "Em andamento";
        Naruto.exibirInformacoes();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.habilidadeEspecial = "Katon - Goukakyuu no Jutsu";
        Sasuke.idade = 17;
        Sasuke.missao = "Matar Itachi";
        Sasuke.nivelDificuldade = "s+";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.exibirInformacoes();

    }
}
