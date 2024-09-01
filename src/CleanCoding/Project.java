package CleanCoding;

import java.text.NumberFormat;
import java.util.Scanner;

public class Project {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float monthly_interest = (float) readNumber("Annual Interest rate: ", 0, 30);
        byte period = (byte) readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, monthly_interest, period);

        printPaymentSchedule(period, principal, monthly_interest);
    }

    private static void printMortgage(int principal, float monthly_interest, byte period) {
        double result = calculateMortgage(principal, monthly_interest, period);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(result);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Montlhy Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(byte period, int principal, float monthly_interest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= period * MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principal, monthly_interest, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
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

    public static double calculateBalance(
                            int principal,
                            float monthlyInterest,
                            int period,
                            short numberOfPaymentsMade){

        monthlyInterest = (monthlyInterest / PERCENT) / MONTHS_IN_YEAR;
        period = period * MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, period) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, period) - 1);

        return balance;
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
