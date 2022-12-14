public class Employee {
    private String fullName;
    private String department;
    private int salary;
    private int id = 1;
    private static int counter;

    public Employee(String fullName, String department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id= id + counter++;
    }


    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:" + id + " " + fullName+  ". " +
                "Департамент \"" + department + "\"" + ". " +
                "з/п:" + " "+ salary + " руб.";
    }
}