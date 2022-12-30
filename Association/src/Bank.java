import java.util.Set;

public class Bank {

    private String name;

    private Set<Employee> employees;

    public Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }
}
