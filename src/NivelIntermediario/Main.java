package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Objeto 1 - Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 15;
//        System.out.println(Naruto.apresentaNinja());
        System.out.println("Faltam " + Naruto.anosParaSeTornarHokage(70) + " anos para eu me tornar Hokage.");
        Naruto.ModoSabioAtivado();

        //Objeto 2 - Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
//        System.out.println(Sasuke.apresentaNinja());
        Sasuke.SharinganAtivado();

        //Objeto 3 - Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
//        System.out.println(Sakura.apresentaNinja());
        Sakura.AtivarCura();

        //Objeto 4 - Hinata
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 15;
        System.out.println(Hinata.ativarByakugan());

        //Objeto 5 - Boruto
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 14;
        System.out.println(Boruto.apresentaNinja());
        Boruto.ativarKarma();
        Boruto.ModoSabioAtivado();
        Boruto.ativarJougan();

    }
}
