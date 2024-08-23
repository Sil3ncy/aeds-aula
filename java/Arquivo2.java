import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.ArrayList;

public class Arquivo2 {
    public static void main(String[] args) {
        try {
            
            RandomAccessFile file = new RandomAccessFile("entrada.txt", "r");
        
            int n = MyIO.readInt();

            // Lista para armazenar as linhas lidas
            ArrayList<String> lines = new ArrayList<>();

            long pointer = 0;
            file.seek(pointer);

           
            while (pointer < file.length() && lines.size() < n) {
                // Posiciona o ponteiro para a nova leitura
                file.seek(pointer);

                // Lê uma linha inteira
                String line = file.readLine();

                // Armazena a linha lida na lista
                lines.add(line);

                // Atualiza a posição do ponteiro após a leitura
                pointer = file.getFilePointer();
            }

            // Fecha o arquivo
            file.close();

            // Imprime as linhas na ordem inversa
            System.out.println("\nLinhas lidas na ordem inversa:");
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
