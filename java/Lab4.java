public class Lab4 {

          
    public static void swap(int x, int y){
       int aux = x;
       x = y;
       y = aux;

    }

    public static void main(String[] args) {

        boolean x = true;

        while (x){
        
        int n = MyIO.readInt();
        int mod = MyIO.readInt();

        if (n == 0 && mod == 0){
            x= false;
        }

        int [] array = new int [n];
        int [] arraymods = new int[n];

        for (int i = 0; i < n; i++) {

            array[i] = MyIO.readInt();
            arraymods[i] = (array[i]%mod);
        }

        for (int i = 0; i < array.length-1; i++) { 

            int menor = i;

            for (int j = i+1; j<array.length;j++){
                
                if (arraymods[menor] > arraymods[j]){
                    swap(array[j], array[menor]);
                    swap(arraymods[j], arraymods[menor]);
                }
                
                
                if (arraymods[menor] == arraymods[j]){
                    if (array[menor]%2 == 0 && array[j]%2 == 1){
                        swap(array[j], array[menor]);
                        swap(arraymods[j], arraymods[menor]);
                    }
                }

                         
                if (arraymods[menor] == arraymods[j]){
                    if (array[menor]%2 == 1 && array[j]%2 == 1){
                      if(array[menor] < array [j]){
                        swap(array[j], array[menor]);
                        swap(arraymods[j], arraymods[menor]);
                      }
                    }
                }

                        
                if (arraymods[menor] == arraymods[j]){
                    if (array[menor]%2 == 0 && array[j]%2 == 0){
                     if(array[menor] > array[j]){
                        swap(array[j], array[menor]);
                        swap(arraymods[j], arraymods[menor]);
                     }
                    }
                }

                

            }
        
        }	
 
        for (int i = 0; i < array.length; i++) {
            MyIO.println(array[i]);
        }

        System.out.println();

      }
    }
}