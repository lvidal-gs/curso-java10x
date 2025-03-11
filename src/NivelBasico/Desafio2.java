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
        int NUMERO_MAXIMO = 5;

        String[] ninjas = new String[NUMERO_MAXIMO];

        int ninjasCadastrados = 0;

        while (rodaPrograma) {
            System.out.println("--------- ESCOLHA UMA OPÇÃO DO MENU --------");
            System.out.println("1 - Cadastrar novo ninja");
            System.out.println("2 - Listar ninjas existentes");
            System.out.println("3 - Limpar lista existente");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();


            switch (escolha) {
                case 1:
                    if(ninjasCadastrados < NUMERO_MAXIMO) {
                        System.out.println("Digite o nome do ninja: ");
                        String novoNinja = scanner.next();
                        ninjas[ninjasCadastrados] = novoNinja;
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
                        System.out.println("----- NINJAS CADASTRADOS -----");
                        for(int i = 0; i < ninjas.length; i++) {
                            String nomeDoNinja = ninjas[i] != null ? ninjas[i] : "Não cadastrado.";
                            System.out.println(i+1 + " - " + nomeDoNinja);
                        }
                    }

                    break;

                case 3:
                    ninjas = new String[NUMERO_MAXIMO];
                    ninjasCadastrados = 0;
                    System.out.println("----- LISTA ESVAZIADA! -----");
                    break;

                case 4:
                    rodaPrograma = false;
                    System.out.println("Obrigado por usar nosso sistema.");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        }




    }



}
