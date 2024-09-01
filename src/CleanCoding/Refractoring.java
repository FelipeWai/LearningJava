package CleanCoding;

import java.lang.management.MonitorInfo;
import java.text.NumberFormat;
import java.util.Scanner;

public class Refractoring {
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
            monthly_interest = scanner.nextFloat();

            if (monthly_interest < 0 || monthly_interest > 30){
                System.out.println("Enter a value between 0 and 30");
            }else{
                System.out.print("Period (Years): ");
                period = scanner.nextInt();
            }
        }

        double result = calculateMortgage(principal, monthly_interest, period);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(result));
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
