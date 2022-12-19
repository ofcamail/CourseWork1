public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private int id;
    private static int counter;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id= ++counter;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
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