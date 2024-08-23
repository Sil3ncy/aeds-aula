import java.util.Scanner;
import java.io.*;

public class iterativo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int up = 0;

        String str;

        boolean fim = true;

        while (fim){

        str = sc.nextLine();

        if(str.equals("FIM")){
            fim = false;
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
        }

        }

        
    }
}