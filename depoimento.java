import java.util.Scanner;

public class depoimento {
    private String nomeDepoente;
    private String dataDepoimento;
    private String textoDepoimento;

    public depoimento(String nomeDepoente, String dataDepoimento, String textoDepoimento) {
        this.nomeDepoente = nomeDepoente;
        this.dataDepoimento = dataDepoimento;
        this.textoDepoimento = textoDepoimento;
    }

    public String getTextoDepoimento() {
        return textoDepoimento;
    }
}
