package Part1.Types;

public class Main {
    public static void main(String[] args) {
        byte age = 30;
        int viewsCount = 123_456_789;
        // Java sees this long as an integer so we need to specify with this L
        long longVariable = 3_123_456_789L;
        // Java sees floats as doubles so we need to put this f to show it's a float
        float price = 10.99f;
        System.out.println(viewsCount);
        char letter = 'A';
        boolean isEligible = true; // Or false
    }
}