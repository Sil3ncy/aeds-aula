import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Is {
  public static void main(String[] args) {

    try{
      String palavra;
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      boolean x = true;

      while(x){
        boolean sovogal = true;
        boolean soconsoante = true;
        boolean inteiro = true;
        boolean real = true;
        
        palavra = reader.readLine();

        if(palavra.equals("FIM")){//verificação se a palavra é igual a "FIM" para encerramento ou continuação do programa
          x = false;
        }

        else{

        for(int i=0;i<palavra.length();i++){ // loop que verifica todos os caracteres da string inserida e define se ela é composta apenas por vogais ou não, caso haja um caractere diferente de A,E,I,O,U
          char ch = palavra.charAt(i);
          if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch!= 'u'){
            sovogal=false;
          }
        }

        for(int i=0;i<palavra.length();i++){// loop que checa se cada caractere da string é uma vogal, dessa forma afirma-se que a booleana que define a string como apenas consoantes é falsa
          char ch = palavra.charAt(i);
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            soconsoante=false;
          }
        }

        for(int i=0;i<palavra.length();i++){// loop que percorre a string em busca de um número,caso encontrado pode-se afirmar que a string não é composta somente por vogais ou consoantes
          char ch = palavra.charAt(i);
          if (Character.isDigit(ch) == true){
            soconsoante = false;
            sovogal = false;
          }
        }

        try{
          int num1 = Integer.parseInt(palavra); //realização de uma parse com o objetivo de definir se a string é um numero inteiro
          
        }catch(NumberFormatException e){ //resposta do parse int
          inteiro = false;
        }
      

        try{
          float num2 = Float.parseFloat(palavra);//realização de uma parse com o objetivo de definir se a string é um numero real

        }catch(NumberFormatException e){//resposta do parse float
          real = false;
        }

     
        //processo de verificação das booleanas que definem as caracteristicas da string e impressão da palavra "SIM" ou "NÃO" dependendo se são verdadeiras ou falsas
        if (sovogal == true){
          System.out.print("SIM ");
        }
        else{
          System.out.print("NAO ");
        }

        if (soconsoante == true){
          System.out.print("SIM ");
        }
        else{
          System.out.print("NAO ");
        }

        if (inteiro == true){
          System.out.print("SIM ");
        }
        else{
          System.out.print("NAO ");
        }

        if (real == true){
          System.out.print("SIM ");
        }
        else{
          System.out.print("NAO ");
        }

        System.out.println();
        
        } 
        
      }


      
      
      
    } catch(IOException e){
      e.printStackTrace();
    }
    
  }

}


