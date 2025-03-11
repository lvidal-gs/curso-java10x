package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        *  Switch cases: Que servem para gerar casos especificos
        * Obj.: Pedir para o usuario escolher o ninja
        * */

        Scanner caixa = new Scanner(System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        switch (caixa.nextInt()) {
            case 1:
                System.out.println("Quero lámen");
                break;
            case 2:
                System.out.println("Ovo matar o Itachi");
                break;
            case 3:
                System.out.println("AAAAAIN SASUKE");
                break;
            default:
                System.out.println("Ninja não especificado");
        }

        caixa.close();
    }
}
