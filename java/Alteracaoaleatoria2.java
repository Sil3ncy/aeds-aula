import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Alteracaoaleatoria2 {
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
                  
                    aleatorio1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26)); // seleção da primeira letra aleatória para ser feita a troca na string
                   
                    aleatorio2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26)); // seleção da segunda letra aleatória para a troca 
                
                    

                    for(int i = 0; i<frase.length(); i++){//inicio do loop que percorrerá a string realizando as alterações
                        if(chararray[i] == aleatorio1 && chararray[i] >= 'a' && chararray[i]<= 'b'){ //checagem pela primeira letra e certificação que ela é minúscula 
                            chararray[i] = aleatorio2;
                        }

                        else{
                            if(chararray[i] == aleatorio2 && chararray[i] >= 'a' && chararray[i]<= 'b'){ //checagem e troca da segunda letra e verificação para minúsculas 
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
