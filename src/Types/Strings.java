package Types;

public class Strings {
    public static void main(String[] args) {
        String message = "Hello World" + "!!";
        System.out.println(message.startsWith("!!"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("sky"));

        // Doesn't modify the original string
        // Strings are immutable and every method that modify them return a new string
        System.out.println(message.replace("!", "*"));
        System.out.println(message);

        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
    }

}
