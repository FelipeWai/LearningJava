package Part1.Types;

public class ArithmeticExpressions {
    public static void main(String[] args) {
        int sum = 10 + 3;
        System.out.println(sum);
        double divison = (double) 10 / (double) 3;
        System.out.println(divison);

        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        x = 1;
        y = ++x;
        System.out.println(x);
        System.out.println(y);

        x += 5;
        System.out.println(x);
    }
}
