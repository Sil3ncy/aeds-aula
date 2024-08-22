import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindromo {

    
     //criacao de uma funcao para inverter a string inerida
    public static String reverseString(String str) {
        //invertesao da string e retorno da versão invertida.
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) throws IOException {

        // utilizacao de um BufferedReader para ler a entrada do usuário.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean x = true;

        // Loop principal para verificar múltiplas palavras/frases
        while (x) {

            // Le string inserida pelo usuário
            String palavra = reader.readLine();

            // Verifica se a entrada é "FIM"
            if (palavra.equals("FIM")) {
                x = false;
            } else {

                // Inverte a string para verificar se é um palíndromo
                String palindromo = reverseString(palavra);

                // Compara a string original com a invertida
                if (palavra.equals(palindromo)) {
                    System.out.println("SIM"); // Se forem iguais, é um palíndromo
                } else {
                    System.out.println("NAO"); // Se forem diferentes, não é um palíndromo
                }
            }
        }
    }
}
