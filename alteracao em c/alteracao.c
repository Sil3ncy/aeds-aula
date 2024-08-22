#include<stdio.h>
#include<string.h>
#include<stdbool.h>
#include<time.h>

int main () {

    bool x = true;
    char palavra [200];

    while(x=true){ //estabelecimento de um loop para recebimento constante de trings
    fgets(palavra,200,stdin);

    if(strcmp(palavra,"FIM\n") == 0){//verifica se a string inserida é igual a fim para encerramento do programa
        return 0;
    }

    srand(4);//estabelece a seed de aletoriedade

    //estabelece 2 caracteres aleatorios
    char aleatorio1 = ('a' + (rand() % 26));
    char aleatorio2 = ('a' + (rand() % 26));



    for(int i =0;i<strlen(palavra); i++){ //loop que percorre a string checando se o caractere naquela posiçaõ é igual a um dos caracteres aleatoriórios escolhidos anteriormente

        if(palavra[i] == aleatorio1){
            palavra[i] = aleatorio1;
        }
        else{
             if(palavra[i] == aleatorio2){
            palavra[i] = aleatorio2;
          }
        }
    }

    puts(palavra);



}


}
