package Part1.ControlFlow;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = - 1;
        float monthly_interest = -1;
        int period = 0;
        while (principal < 1000 || principal > 1_000_000){
            System.out.print("Principal (1K - 1M): ");
            principal = scanner.nextInt();
        }
        while(monthly_interest < 0 || monthly_interest > 30){
            System.out.print("Annual Interest Rate: ");
            monthly_interest = (scanner.nextFloat() / PERCENT) / 12;

            if (monthly_interest < 0 || monthly_interest > 30){
                System.out.println("Enter a value between 0 and 30");
            }else{
                System.out.print("Period (Years): ");
                period = scanner.nextInt() * MONTHS_IN_YEAR;
            }
        }

        double firstHalf = monthly_interest * (Math.pow(1+monthly_interest, period));
        double secondHalf = Math.pow(1 + monthly_interest, period) - 1;
        double result = principal * (firstHalf / secondHalf);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(result));
    }
}
