public class classificacao {
    public String classificarDepoimento(String textoDepoimento) {
        int contadorPalavras = 0;

        String[] palavrasOdio = {"matar", "bater", "agredir", "xingar", "raiva"};

        // Transforma o texto do depoimenMariato em minúsculas para tornar a comparação de palavras de ódio case-insensitive
        String textoMinusc = textoDepoimento.toLowerCase();

        // Divide o texto do depoimento em palavras separadas para verificar cada palavra individualmente
        String[] palavras = textoMinusc.split("\\s+"); // Divide por espaços em branco

        // Conta a ocorrência de palavras de ódio no texto do depoimento
        for (String palavra : palavras) {
            for (String palavraOdio : palavrasOdio) {
                if (palavra.contains(palavraOdio)) {
                    contadorPalavras++;
                    break; // Sai do loop interno assim que uma palavra de ódio for encontrada
                }
            }
        }

        // Classifica o depoimento com base no número de palavras de ódio encontradas
        if (contadorPalavras > 10) {
            return "Inseguro";
        } else if (contadorPalavras > 5) {
            return "Aceitável";
        } else {
            return "Livre";
        }
    }
}
