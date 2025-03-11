package NivelBasico;

public class Arrays {
    public static void main(String[] args) {
        //Tipo [] variavelNome

        String[] ninjas = new String[5];
        System.out.println(ninjas);

        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Saruka Haruno";

        mostraElementos(ninjas);

        //Redeclaração de Arrays
        ninjas = new String[6];
        ninjas[0] = "Hashirama Tenju";
        ninjas[1] = "Tobirama Senju";
        ninjas[2] = "Hiruzen Sarutobi";
        ninjas[3] = "Minato Namikaze";
        ninjas[4] = "Tsnudade";
        ninjas[5] = "Kakashi Hatake";
        System.out.println(ninjas);

        mostraElementos(ninjas);


//        System.out.println(ninjas[4]);
//        System.out.println(idades[2]);
    }

    public static void mostraElementos(String[] ninjas) {
        for(int i = 0; i < ninjas.length; i++) {
            System.out.println("FOR - " + ninjas[i]);
        }
    }
}























