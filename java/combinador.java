public class combinador {
    public static void main(String[] args) {

        String str1 = MyIO.readLine();
        String str2 = MyIO.readLine();
        int j=0;

        int [] array = new int [str1.length()+str2.length()];

        for (int i =0;i<str1.length();i+=2){
            char ch = str1.charAt(j);
            array[i] = ch;
            j++;
        }

        j=0;

        for (int i =1;i<str2.length();i+=2){
            char ch = str2.charAt(j);
            array[i] = ch;
            j++;
        }

        array.toString();
        System.out.println(array);
        MyIO.println();
    }
}
