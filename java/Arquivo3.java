import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Arquivo3 {
    public static void main(String[] args) {

        String filePath = "numeros.txt"; // Caminho do arquivo

        try { 
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }

            try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
                Scanner scanner = new Scanner(System.in);
                
              
                int n = scanner.nextInt();

                for (int i = 0; i < n; i++) {

                    float num = scanner.nextFloat();
                    raf.writeBytes(Float.toString(num) + "\n");
                }

                long pointer = raf.length(); // Começa no final do arquivo para imprimir os dados do ultimo ao primeiro
                raf.seek(pointer);

                StringBuilder sb = new StringBuilder();

                for (long i = pointer - 2; i >= 0; i--) { // Ignora o último "\n"
                    raf.seek(i);
                    char c = (char) raf.readByte();
                    if (c == '\n') {
                        System.out.println(sb.reverse().toString());
                        sb = new StringBuilder();
                    } else {
                        sb.append(c);
                    }
                }

                if (sb.length() > 0) {
                    System.out.println(sb.reverse().toString());
                }
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
