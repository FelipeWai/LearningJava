package Part1.ControlFlow;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass")){
                continue;
            }
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
