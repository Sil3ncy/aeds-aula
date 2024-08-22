public class Cesar {
    
    
    public static String cifrada (String palavra){

        int cifra = 3;
        StringBuilder word = new StringBuilder();
        
        if(palavra.equals("FIM")){
            System.exit(0);
        }

        else{
            for(int i =0;i<palavra.length();i++){
                char ch = palavra.charAt(i);
                char newch = (char) (ch + cifra);
                word.append(newch);
                
            }

            word.toString();
            System.out.println(word);
            
        }

    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        MyIO.setCharset("US-ASCII");

        String palavra = MyIO.readLine();
        boolean x = true;
    
        StringBuilder word = new StringBuilder();

        while (x){


    }
  }
}
