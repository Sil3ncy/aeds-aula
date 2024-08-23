import java.util.Scanner;
import java.io.*;

public class ierativorec {
  
    public static void contar (Scanner sc){
        

        int up = 0;
        String str;
        boolean fim = true;

        str = sc.nextLine();

        
        if(str.equals("FIM")){
            System.exit(0);
        }

        else{
            up = 0;
            for(int i =0; i<str.length();i++){
                char ch = str.charAt(i);
                
                if (ch >= 'A' && ch <= 'Z'){
                    up++;
                }
            }
            System.out.println(up);
            contar(sc);
        }


        
    }
         

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            contar(sc);
    }
    
}
