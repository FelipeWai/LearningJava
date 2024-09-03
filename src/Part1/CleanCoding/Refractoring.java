package Part1.CleanCoding;

import java.text.NumberFormat;
import java.util.Scanner;

public class Refractoring {
    public static void main(String[] args) {

        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float monthly_interest = (float) readNumber("Annual Interest rate: ", 0, 30);
        byte period = (byte) readNumber("Period (Years): ", 1, 30);

        double result = calculateMortgage(principal, monthly_interest, period);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(result));
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true){
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max){
                break;
            }
            System.out.println("Enter a value between " + min + "and " + max);
        }
        return value;
    }

    public static double calculateMortgage(
            int principal,
            float monthlyInterest,
            int period){

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        monthlyInterest = (monthlyInterest / PERCENT) / MONTHS_IN_YEAR;
        period = period * MONTHS_IN_YEAR;


        double firstHalf = monthlyInterest * (Math.pow(1+monthlyInterest, period));
        double secondHalf = Math.pow(1 + monthlyInterest, period) - 1;

        return principal * (firstHalf / secondHalf);
    }
}
