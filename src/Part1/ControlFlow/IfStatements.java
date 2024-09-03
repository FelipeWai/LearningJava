package Part1.ControlFlow;

public class IfStatements {
    public static void main(String[] args) {
        int temp = 12;

        if (temp >= 30){
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }else if(temp > 20 && temp <= 30){
            System.out.println("Beautiful day");
        }else{
            System.out.println("Cold day");
        }

    }
}
