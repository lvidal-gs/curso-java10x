package NivelBasico.LacosDeRepeticoes;

public class Lacos {
    public static void main(String[] args) {
        //WHILE
        //WHILE (condição) { Acontece enquanto parar de ser satisfeita }

        int numeroDeClones = 1;
        int numMaximoDeClones = 20;

        while (numeroDeClones <= numMaximoDeClones) {
            System.out.println("O naruto fez mais um clone! - " + numeroDeClones);
            numeroDeClones++;
        }

        // FOR
        for (int i = 1; i < numMaximoDeClones; i++) {
            System.out.println("FOR - O naruto fez mais um clone! - " + numeroDeClones);
        }
    }
}
