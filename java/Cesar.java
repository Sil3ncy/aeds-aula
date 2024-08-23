public class Cesar {
    
    
    public static void cifrada (String palavra){


        int cifra = 3;
        StringBuilder word = new StringBuilder();


        
            
            for(int i =0;i<palavra.length();i++){ //loop que percorre a string realiznado o ciframento
                char ch = palavra.charAt(i);
                if (ch >= 32 & ch <= 126) {
                    char base = 32;
                    ch = (char) ((ch - base + cifra) %95 + base); //ajuste para a tabela ascii para que o ciframento seja feito de forma correta
                }

                word.append(ch);
                
            }
            
            //impressão da nova string cifrada
            word.toString();
            System.out.println(word);
            
            
        

    }
    
    
    
    
    public static void main(String[] args) {
    MyIO.setCharset("UTF-8");

        String palavra = MyIO.readLine();
        cifrada(palavra);
        boolean x = true;

        while (x){ //loop que chama o processo de ciframento enquanto a palavra não for "FIM"
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
