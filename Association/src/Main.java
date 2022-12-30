import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Kotak");
        Employee hrishi = new Employee("Hrishi");
        Employee ketan = new Employee("Ketan");

        Set<Employee> employees = new HashSet<>();
        employees.add(hrishi);
        employees.add(ketan);

        bank.setEmployees(employees);

        System.out.println("This is "+ bank.getBankName()+" International Bank.");
        System.out.println("Employees of the International Kotak bank are as follow: ");
        System.out.println(bank.getEmployees());
    }
}