// Sum of Characters (ASCII)
// Write a function that takes a and returns the sum of its characters
// ASCII values (`int`). `String`

public class Main {
    public static int calcAscii(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            sum += (int) c;
        }
        return sum;
    }

    public static void main(String[] args) {
        String c = "humpdydumpdy" ;
        System.out.println(calcAscii("money"));
        System.out.println(c.length()) ;
    }
}
// static means that it belongs to the class
