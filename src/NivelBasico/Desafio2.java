package NivelBasico;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("⸝͟๏︠ CADASTRO DE NINJAS DA ALDEIA DA FOLHA ⸝͟๏︠");
        System.out.println("Made by: Lucas Vidal 火");
        System.out.println("--------------------------------------------");
        System.out.println();

        boolean rodaPrograma = true;
        final int NUMERO_MAXIMO = 5;

        String[] ninjas = new String[NUMERO_MAXIMO];
        int escolha = 0;

        int ninjasCadastrados = 0;

        while (rodaPrograma) {
            System.out.println("--------- ESCOLHA UMA OPÇÃO DO MENU --------");
            System.out.println("1 - Cadastrar novo ninja");
            System.out.println("2 - Listar ninjas existentes");
            System.out.println("3 - Limpar lista existente");
            System.out.println("4 - Deletar ninja");
            System.out.println("5 - Sair");

            escolha = scanner.nextInt();
        scanner.nextLine();

            switch (escolha) {
                case 1:
                    if(ninjasCadastrados < NUMERO_MAXIMO) {
                        System.out.println("Digite o nome do ninja: ");
                        String novoNinja = scanner.nextLine();
                        for (int i = 0; i < ninjas.length; i++) {
                            if(ninjas[i] == null) {
                                ninjas[i] = novoNinja;
                                break;
                            }
                        }
                        ninjasCadastrados++;
                        System.out.println("----- NINJA CADASTRADO COM SUCESSO -----");
                    } else {
                        System.out.println("----- LIMITE MÁXIMO ATINGIDO -----");
                    }
                    break;

                case 2:
                    if(ninjasCadastrados == 0) {
                        System.out.println("----- NÃO EXISTEM NINJAS CADASTRADOS -----");
                    } else {
                        System.out.println("=========== NINJAS CADASTRADOS ===========");
                        for(int i = 0; i < ninjas.length; i++) {
                            String nomeDoNinja = ninjas[i] != null ? ninjas[i] : "* Não cadastrado *";
                            System.out.println(i+1 + " - " + nomeDoNinja.toUpperCase());
                        }
                        System.out.println("=========================================");
                    }

                    break;

                case 3:
                    ninjas = new String[NUMERO_MAXIMO];
                    ninjasCadastrados = 0;
                    System.out.println("----- LISTA ESVAZIADA! -----");
                    break;

                case 4:
                    System.out.println("----- DELETANDO NINJA -----");
                    if(ninjasCadastrados > 0) {
                        System.out.print("Informe o número do ninja que você quer deletar da lista:  ");
                        int ninjaDeletado = scanner.nextInt();
                        ninjas[ninjaDeletado - 1] = null;
                        ninjasCadastrados--;
                        System.out.printf("\nO ninja n°%d foi excluido com sucesso!\n", ninjaDeletado);
                    } else {
                        System.out.println("Não há ninjas para serem deletados.");
                    }
                    break;

                case 5:
                    rodaPrograma = false;
                    System.out.println("Obrigado por usar nosso sistema.");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        }


        scanner.close();

    }



}
