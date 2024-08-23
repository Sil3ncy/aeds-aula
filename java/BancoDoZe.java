import java.util.Scanner;

public class BancoDoZe {
    public static void main(String[] args) {
        
        int x; // valor do salario
        int y; // valor da taxa 

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        
        sc = new Scanner(System.in);
        y = sc.nextInt();

        if (y > ((x/100) * 40)){
            System.out.println("taxa invalida");
        }
        else{
            System.out.println("taxa aplicada");
        }

        


        
    }
}
