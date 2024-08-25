public class Combinador2 {
    public static void main(String[] args) {
        String str1 = MyIO.readLine();
        String str2 = MyIO.readLine();
        StringBuilder combinada = new StringBuilder();

        int maxLength = Math.max(str1.length(), str2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < str1.length()) {
                combinada.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                combinada.append(str2.charAt(i));
            }
        }

        System.out.println(combinada.toString());
    }
}
