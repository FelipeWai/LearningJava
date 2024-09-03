package Part1.Types;

public class Casting {
    public static void main(String[] args) {
        // Implicit Casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        // Explicit Casting
        double a = 1.1;
        int b = (int) a + 2; // 2.0 + 1.1
        System.out.println(b);

        String s = "1.1";
        double sToNumber = Double.parseDouble(s) + 2;
        System.out.println(sToNumber);
    }
}
