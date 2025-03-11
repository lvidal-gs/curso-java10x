package NivelBasico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE
        * Obj.: Passar o nivel do ninja a partir do numero de missoes
        * */

        String nome = "Naruto Uzumaki";
        String rank;

        boolean hokage = false;
        short idade = 16;
        short numeroDeMissoes = 9;

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else  {
            System.out.println("Rank: Gennim");
        }
    }
}
