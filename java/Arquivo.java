import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Arquivo {
    public static void main(String[] args) {
        try{
            RandomAccessFile file = new RandomAccessFile("entrada.txt", "r");

            long fileSize = file.length();

            long pointer = 0;
            file.seek(pointer);

            int n = MyIO.readInt();
            int lineCount =0;

            while(pointer < file.length() && lineCount < n){
                
                file.seek(pointer);
                String str = file.readLine();
                MyIO.println(str);
                pointer = file.getFilePointer();
                lineCount++;
            }






            file.close();

        }


        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
