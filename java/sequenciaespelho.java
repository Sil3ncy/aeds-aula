public class sequenciaespelho {

    public static void main(String[] args) {
        int begin = MyIO.readInt();
        int end = MyIO.readInt();

        int isnegative = (end - begin);//verifica se o numero final é menor que o inicial para imprimir a sequencia de forma decrescente

        if (isnegative < 0){

            for(int i = begin; i >= end; i--){ //inicio de um loop para imprimir a sequencia de forma invertida caso e verificação acima for verdadeira
                MyIO.print(i);
            }

            for(int i = end; i<=begin;i++){
                MyIO.print(i);
            }
         
        }

     else{//inicio de um loop para imprimir a sequencia de forma normal caso e verificação acima for falsa

        for(int i = begin; i<=end;i++){
            MyIO.print(i);
        }

        for(int i = end; i >= begin; i--){
            MyIO.print(i);
        }
    }
  }  
}
