public class Palindromorec {



    public static String reverseString(String str) { //função que possui o objetivo de iverter a string inserida para ser comparada
        //invertesao da string e retorno da versão invertida.
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }




    public static void palindromo (String palavra){ //declaração da função

        if (palavra.equals("FIM")){ // verificação da palvra inserida para encerramento do programa caso seja "FIM"
            System.exit(0);
        }

        else{ 
            
            

            String inverso = reverseString(palavra);//inversão da string inserida

            if (inverso.equals(palavra)){//checa se a string é um palindromo
                System.out.println("SIM");
            }

            else{
                System.out.println("NAO");
            }
            palavra = MyIO.readLine();
            palindromo(palavra); // chamada da função para repetir o processo 
    }

        
    }

    public static void main(String[] args) {
        String palavra1 = MyIO.readLine(); //leitura da string pela primeira vez para inicio da recursão 
        palindromo(palavra1);
    }
    
}
