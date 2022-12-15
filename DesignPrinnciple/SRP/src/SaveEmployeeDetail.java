public class SaveEmployeeDetail {
    public boolean saveEmployeDetails(Employee employee, String mode) {
        if (mode.equalsIgnoreCase("insert")) {
            System.out.println("Inserted the value in DB");
            return true;
        }
        else {
            System.out.println("updated the values in DB");
            return true;
        }
    }
}
