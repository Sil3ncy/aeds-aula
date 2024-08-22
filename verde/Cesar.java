public class Cesar {
    
    
    public static void cifrada (String palavra){


        int cifra = 3;
        StringBuilder word = new StringBuilder();


        
            
            for(int i =0;i<palavra.length();i++){
                char ch = palavra.charAt(i);
                if (ch >= 32 & ch <= 126) {
                    char base = 32;
                    ch = (char) ((ch - base + cifra) %95 + base);
                }

                word.append(ch);
                
            }

            word.toString();
            System.out.println(word);
            //return word;
            
        

    }
    
    
    
    
    public static void main(String[] args) {
    MyIO.setCharset("UTF-8");

        String palavra = MyIO.readLine();
        cifrada(palavra);
        boolean x = true;

        while (x){
            palavra = MyIO.readLine();

            if (palavra.equals("FIM")){
                x = false;
            }

            else{
                cifrada(palavra);
            }
        }

        
    

}

}
