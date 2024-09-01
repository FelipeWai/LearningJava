package Types;

import java.text.NumberFormat;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        float monthly_interest = scanner.nextFloat();
        monthly_interest = (monthly_interest/100) / 12;

        System.out.print("Period (years): ");
        double payments = scanner.nextDouble();
        payments = payments * 12;

        double first = monthly_interest * (Math.pow(1+monthly_interest, payments));
        double second = Math.pow(1 + monthly_interest, payments) - 1;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double result = principal * (first / second);


        System.out.println(currency.format(result));
    }
}
