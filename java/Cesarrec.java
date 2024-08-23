public class Cesarrec {

    public static void cifrada (String palavra){


   if(palavra.equals("FIM")){//verifica se a palavra inserida é igual a "FIM" para prosseguimento ou encerramento do programa
    System.exit(0);
   }


  else{
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

            word.toString(); //passagem do stringbuilder para uma string após a alteração e exibição na tela
            System.out.println(word);
            palavra = MyIO.readLine();
            cifrada(palavra);

}




            }



            public static void main(String[] args) {
                MyIO.setCharset("UTF-8");
            
                    String palavra = MyIO.readLine();
                    cifrada(palavra);
                   
            }
    
}
