package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
         * variavel = (condição) ? ValorSeVerdadeiro : valorSeFalso;
         *  */

        short numeroDeMissoes = 11;

        String nivel = (numeroDeMissoes >= 10) ? "Nivel Jounin" : "Nivel Gennim";

        System.out.println(nivel);
    }
}
