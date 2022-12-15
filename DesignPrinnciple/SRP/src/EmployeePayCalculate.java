public class EmployeePayCalculate {
    public void calculateSalary(Employee employee) {
        String grade = employee.getGrade();
        double salary = 0.0;

        if (grade == "A") {
            salary = 50000;
        } else if (grade == "B") {
            salary = 35000;
        } else if (grade == "C") {
            salary = 20000;
        }
        System.out.println("Salary for this grade is: "+ salary);
    }
}