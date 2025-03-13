package NivelBasico;

public class Desafio1 {
    public static void main(String[] args) {
        //Ninja 1
        String nomeNinja = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Acabar com um bandido";
        String statusDaMissao = "Em andamento";
        char dificuldade = 'B';
        String novoStatusDaMissao = retornaStatus(idade, dificuldade, statusDaMissao);

        printaTudo(nomeNinja, idade, dificuldade, missao, novoStatusDaMissao);


        //Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 17;
        String missao2 = "Matar o Itachi";
        String statusDaMissao2 = "Em andamento";
        char dificuldade2 = 'S';

        String novoStatusDaMissao2 = retornaStatus(idade2, dificuldade2, statusDaMissao2);
        printaTudo(nomeNinja2, idade2, dificuldade2, missao2, novoStatusDaMissao2);


        //Ninja 3
        String nomeNinja3 = "Lucas Vidal";
        int idade3 = 24;
        String missao3 = "Aprender Java";
        String statusDaMissao3 = "Em andamento";
        char dificuldade3 = 'S';

        String novoStatusDaMissao3 = retornaStatus(idade3, dificuldade3, statusDaMissao3);
        printaTudo(nomeNinja3, idade3, dificuldade3, missao3, novoStatusDaMissao3);



    }

    public static String retornaStatus(int idade, char dificuldade, String statusDaMissao) {
        if (idade < 15) {
            if (dificuldade == 'C' || dificuldade == 'D') {
                statusDaMissao = "Concluída";
            } else {
                statusDaMissao = "Não Concluída";
            }
        } else {
            statusDaMissao = "Concluída";
        }

        return statusDaMissao;
    }

    public static void printaTudo(String nome,int idade, char dificuldade, String missao, String status) {
        System.out.println("----------------------------");
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade + "anos");
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade da missão: " + dificuldade);
        System.out.println("Status da missão: " + status);
        System.out.println("----------------------------");
    }

}
