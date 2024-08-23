import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cesar2 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean x = true;

        while (x) {
            try {
                String palavra;

                palavra = reader.readLine(); // pega a string inserida pelo usuário

                if (palavra.equals("FIM")) { // verifica se a string inserida é "FIM" e realiza o encerramento do programa caso seja
                    System.exit(0);
                } else {
                    StringBuilder cifrada = new StringBuilder();

                    for (int i = 0; i < palavra.length(); i++) {
                        char ch = palavra.charAt(i); // pega cada letra da string inserida pelo usuário para a realização do ciframento

                        if (Character.isLetter(ch)) { 
                            if (Character.UnicodeBlock.of(ch) == Character.UnicodeBlock.BASIC_LATIN) { 
                                // Ciframento para caracteres latinos básicos
                                if (Character.isUpperCase(ch)) {
                                    ch = (char) ('A' + (ch - 'A' + 3) % 26);
                                } else if (Character.isLowerCase(ch)) {
                                    ch = (char) ('a' + (ch - 'a' + 3) % 26);
                                }
                            } else if (Character.UnicodeBlock.of(ch) == Character.UnicodeBlock.LATIN_1_SUPPLEMENT || 
                                       Character.UnicodeBlock.of(ch) == Character.UnicodeBlock.LATIN_EXTENDED_A) {
                                // Ciframento para caracteres especiais (LATIN-1 Supplement e Latin Extended-A)
                                ch += 3;
                            }
                        }
                        cifrada.append(ch);
                    }

                    System.out.println(cifrada.toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
