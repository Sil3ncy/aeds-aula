import java.util.Stack;

public class Algebra {

    public static void main(String[] args) {
        boolean x = true;
        // not and or
        while (x) {

            
            int n = MyIO.readInt();
            
            if (n == 0) {
                System.exit(0);
            }

            int [] array = new int [3];

            for(int i = 0; i<n; i++){
                array[i] = MyIO.readInt();
            }

            String str = MyIO.readLine();
            
            str = str.replace(" ", "");
            str = str.replace("and", "a");
            str = str.replace("or", "o");
            str = str.replace("not", "n");
            str = str.replace("A", String.valueOf(array[0]));
            str = str.replace("B", String.valueOf(array[1]));
            str = str.replace("C", String.valueOf(array[2]));
            boolean verify = true;

            Stack<Character> stack = new Stack<>();
            //Stack<Character> reserva = new Stack<>();
            
            //System.out.println(str);
            
            for (int i =0 ;i<str.length(); i++){
                char ch = str.charAt(i);
                
                if (ch != ')'){
                    stack.push(ch);
                }
                else{
                    String reserva = new String();
                    while(ch != '('){
                      ch = stack.pop();
                      reserva += ch;
                    }
                    ch=stack.pop();
                    verify = true;
                    switch (ch) {
                        case 'a' :
                            for (int z=0; z<reserva.length(); z++){
                                char ch1 = reserva.charAt(z);

                                if (ch1 == '0'){
                                    verify = false;
                                }
                             
                            }
                            if (verify == true){
                                stack.push('1');
                            }
                            else{
                                stack.push('0');
                            }
                            break;

                        case 'o' :

                        for (int z=0; z<reserva.length(); z++){
                            char ch1 = reserva.charAt(z);

                            if (ch1 == '1'){
                                verify = false; // achou o 1
                            }
                         
                        }
                        if (verify == true){
                            stack.push('0');
                        }
                        else{
                            stack.push('1');
                        }
                        break;

                       

                        case 'n' :

                        for (int z=0; z<reserva.length(); z++){
                            char ch1 = reserva.charAt(z);

                            if (ch1 == '0'){
                                verify = false;
                            }
                         
                        }
                        if (verify == true){
                            stack.push('0');
                        }
                        else{
                            stack.push('1');
                        }
                         
                           




                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            }

            System.out.println(stack.pop());
            
     
        }
    }
}
