package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {
        /*
        * Scanner é um jeito de trazer o user para aplicação
        * Obj.: O usuárioo cria um ninja e nós validamos
        * */

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.print("Insira o nome do Ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        System.out.println("Qual a idade dele?: ");
        int idade = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é " + idade);

        if(idade >= 18) {
            System.out.println("Esse ninja é maior de idade. Pode ir para missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja é menor de idade. Vai carpir mato.");
        }

        //Fechar sempre
        caixaDeTexto.close();
    }
}
