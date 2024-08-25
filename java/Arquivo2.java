import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class Arquivo2 {
    public static void main(String[] args) {


        String filePath = "numeros.txt"; // Caminho do arquivo

        
        try {// cria o arquivo
            
            File file = new File(filePath);//verifica se o arquivo existe e o cria caso não exista
            if (!file.exists()) {
                
                file.createNewFile();
            }

       
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            
          
        
            int n = MyIO.readInt();



            for(int i =0;i<n;i++){//inicio de um loop para leitura dos numeros e sua inserção no file
                float num = MyIO.readFloat();
                raf.writeBytes(Float.toString(num) + "\n");
            }

        

            // Lista para armazenar as linhas lidas
            ArrayList<String> lines = new ArrayList<>();

            long pointer = 0;
            raf.seek(pointer);

           
            while (pointer < raf.length() && lines.size() < n) {
              
                raf.seek(pointer);

                // Lê uma linha inteira
                String line = raf.readLine();

               
                lines.add(line);

                
                pointer = raf.getFilePointer();
            }

            // Fecha o arquivo
            raf.close();

            // Imprime as do final ate o inicio
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }

            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
