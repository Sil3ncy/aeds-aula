import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Alteracaoaleatoria {
    public static void main(String[] args) {
        String frase;
        boolean x = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char aleatorio1; //variaveis que irao armazenar os caracteres escolhidos aleatoriamente para serem trocados na strig
        char aleatorio2;

        Random gerador = new Random(); //criação de um gerador aleatorio para selecionar as letras a serem trocadas na string
        gerador.setSeed(4);

        try{

            while(x){

                frase = reader.readLine(); //leitura da string inserida
                char[] chararray = frase.toCharArray();//transformação da string inseria em array para sua manipulação

                if(frase.equals("FIM")){ //verificação da string inserida para encerramento do codigo ou continuação
                    x = false;
                }
          
                else{

                    if(frase.length() >= 26){

                        int a = Math.abs(gerador.nextInt() % 26);//seleção de um numero aleatorio dentro da string para selecionar a primeira letra
                        aleatorio1 = frase.charAt(a);//atribuição da primeira letra escolhida aleatoriamente na string em uma variavel
                        int b = Math.abs(gerador.nextInt() % 26);//seleção de um numero aleatorio dentro da string para selecionar a segunda letra
                        aleatorio2 = frase.charAt(b);//atribuição da segunda letra escolhida aleatoriamente na string em uma variavel

                    }

                    else{

                    
                    int a = Math.abs(gerador.nextInt() % frase.length());
                    aleatorio1 = frase.charAt(a);
                    int b = Math.abs(gerador.nextInt() % frase.length());
                    aleatorio2 = frase.charAt(b);
                
                    }

                    for(int i = 0; i<frase.length(); i++){//inicio do loop que percorrerá a string realizando as alterações
                        if(chararray[i] == aleatorio1){
                            chararray[i] = aleatorio2;
                        }

                        else{
                            if(chararray[i] == aleatorio2){
                                chararray[i] = aleatorio1;
                            }
                        }
                    }


                }
              
                for(int i = 0;i<frase.length(); i++){//impressão da frase inserida apos a troca das letras ser realizada
                    System.out.print(chararray[i]);
                }
                System.out.println();
                

            }








        } catch(IOException e){
            e.printStackTrace();
        }





    }
}
