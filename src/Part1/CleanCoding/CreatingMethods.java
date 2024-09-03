package Part1.CleanCoding;

public class CreatingMethods {
    public static void main(String[] args) {
        String greetReturn = greetUser("Felipe", "Wai");
        System.out.println(greetReturn);
    }

    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }
}
