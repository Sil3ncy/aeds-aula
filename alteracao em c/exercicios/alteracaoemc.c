#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

#define MAX_LENGTH 1000

// Função para gerar um caractere aleatório entre 'a' e 'z'
char gerar_letra_aleatoria() {
    return 'a' + rand() % 26;
}

// Função para substituir todas as ocorrências de uma letra por outra na string
void substituir_letras(char *str, char letra1, char letra2) {
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == letra1) {
            str[i] = letra2;
        } else if (str[i] == letra2) {
            str[i] = letra1;
        }
    }
}

int main() {
    char linha[MAX_LENGTH];
    char letra1, letra2;
    
   
    srand(4);//definição da seed de aleatoriedade

    while (1) {
       
        if (fgets(linha, sizeof(linha), stdin) == NULL) {
            break; 
        }
        
       
        linha[strcspn(linha, "\n")] = '\0';

        if (strcmp(linha, "FIM") == 0) {//verifica o encerramento do programa
            break;
        }

     
        letra1 = gerar_letra_aleatoria();
        letra2 = gerar_letra_aleatoria();

   
        substituir_letras(linha, letra1, letra2);

        
        printf("%s\n", linha);
    }

    return 0;
}
