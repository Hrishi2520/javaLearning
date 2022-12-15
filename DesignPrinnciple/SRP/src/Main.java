public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Hrishi", 23, "A");
        EmployeePayCalculate payCalculate = new EmployeePayCalculate();
        payCalculate.calculateSalary(employee);

        EmployeeReport report = new EmployeeReport();
        report.printEployeeReport("salaryReport", employee);

        SaveEmployeeDetail saveemployee = new SaveEmployeeDetail();
        saveemployee.saveEmployeDetails(employee, "insert");
    }
}