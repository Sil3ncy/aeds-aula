import java.util.Scanner;

class ExemploScanner {

    
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {

      int x;
      int y;
      int z;

      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();

      sc = new Scanner(System.in);
      y = sc.nextInt();

      sc = new Scanner(System.in);
      z = sc.nextInt();

      if (x==y & x==z & y==z){
        System.out.println("equilatero");
      }

      else{
        if(x != y & x != z & y!=z){
            System.out.println("escaleno");
        }

        else{
            System.out.println("isoceles");
        }
      }

    
    }
}