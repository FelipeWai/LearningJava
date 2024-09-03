package Part1.ControlFlow;

public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You're a moderator ");
                break;

            default:
                System.out.println("You're a guest");
        }

        int test = 1;

        switch (test){
            case 1:
                System.out.println("1");
                break;
        }
    }
}
