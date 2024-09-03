package Part1.ControlFlow;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do{
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
        }while (!input.equals("quit"));
    }
}
