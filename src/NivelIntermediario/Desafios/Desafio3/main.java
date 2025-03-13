package NivelIntermediario.Desafios.Desafio3;

import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    static boolean running = true;
    static Uchiha[] ninjas = new Uchiha[5];
    static int ninjasCadastrados = 0;

    public static void main(String[] args) {
//        Ninja Naruto = new Ninja();
//        Naruto.nome = "Naruto Uzumaki";
//        Naruto.idade = 15;
//        Naruto.missao = "Tornar-se Hokage";
//        Naruto.nivelDificuldade = "s++";
//        Naruto.statusMissao = "Em andamento";
//        Naruto.exibirInformacoes();
//
//        Uchiha Sasuke = new Uchiha();

        while (running) {
            int opcao = exibeMenu();
            scanner.nextLine();

            if (opcao <= 5)
                gerenciaOpcoes(opcao);
            else
                System.out.println("Opção inválida! Tente novamente.");


        }
    }

    public static int exibeMenu () {
        System.out.println("====== CADASTRO DE NINJAS ======");
        System.out.println("Made by: Lucas Vidal ");
        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.println("================================");
        System.out.println("1 - Cadastrar ninja");
        System.out.println("2 - Listar ninjas");
        System.out.println("3 - Ver infos de um ninja");
        System.out.println("4 - Atualizar habilidade de um ninja");
        System.out.println("5 - Sair");
        System.out.println("================================");

        int escolha = scanner.nextInt();

        return escolha;
    }

    public static void gerenciaOpcoes(int opcaoSelecionada) {
        switch (opcaoSelecionada) {
            case 1:
                cadastraNinja();
                break;
            case 2:
                System.out.println("* LISTA DE NINJAS *");
                System.out.println();
                if(ninjasCadastrados > 0) {
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.printf("%d - %s\n", i+1, ninjas[i] != null ? ninjas[i].nome : "* NÃO CADASTRADO *");

                    }
                } else {
                    System.out.println("Lista vazia.");
                }
                System.out.println("****************************");
                break;

            case 3:
                System.out.println("* INFORMAÇÕES DE NINJA *");
                System.out.print("Qual o número do ninja que você quer visualizar? ");
                int ninjaEscolhido = scanner.nextInt();

                if(ninjas[ninjaEscolhido - 1] == null) {
                    System.out.println("\nNão existe esse ninja.");
                } else {
                    ninjas[ninjaEscolhido].exibirInformacoes();
                }

                System.out.println("\n****************************");
                break;
            case 4:
                System.out.println("\nConstruindo...");
                break;
            case 5:
                System.out.println("Encerrando programa...");
                running = false;
                break;
        }
    }

    public static void cadastraNinja() {
        System.out.println("===== CADASTRANDO NOVO NINJA =====");

        Uchiha novoNinja = new Uchiha();

        System.out.print("Insira o nome do novo ninja: ");
        novoNinja.nome = scanner.nextLine();


        System.out.print("\nInsira a idade: ");
        novoNinja.idade = scanner.nextInt();

        System.out.print("\nQual a habilidade especial?");
        scanner.nextLine();
        novoNinja.habilidadeEspecial = scanner.nextLine();


        System.out.print("\nQual a missão dele?");
        novoNinja.missao = scanner.nextLine();

        System.out.print("\nE a dificuldade?");
        novoNinja.nivelDificuldade = scanner.nextLine();

        System.out.print("\nSituação da misão");
        novoNinja.statusMissao = scanner.nextLine();

        System.out.println("NINJA CADASTRADO COM SUCESSO!");

        for (int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] == null) {
                ninjas[i] = novoNinja;
                break;
            }
        }

        ninjasCadastrados++;
    }


}
