package Part2;

public class Encapsulation {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);

        System.out.println(wage);
    }
}
