package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia = "Aldeia da Folha";
    int idade;

    public String apresentaNinja() {
        return "Oi, meu nome é " + nome;
    }

    public int anosParaSeTornarHokage(int idadeMinima) {
        return idadeMinima - idade;
    }
}
