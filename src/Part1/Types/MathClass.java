package Part1.Types;

public class MathClass {
    public static void main(String[] args) {
        // Round a float to a hole number
        int round = Math.round(1.1F);
        System.out.println(round);

        // Rounds the double to the largest hole number close to it
        int ceil = (int) Math.ceil(1.1F);
        System.out.println(ceil);

        // Rounds the double to the smallest hole number close to it
        int floor = (int) Math.floor(1.1F);
        System.out.println(floor);

        // Returns the greater number
        int max = Math.max(1, 2);
        System.out.println(max);

        int min = Math.min(1, 2);
        System.out.println(min);

        // Return a random double between 0 and 1
        double random = Math.random();
        System.out.println(random);

    }
}
