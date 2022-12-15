public class Main {
    static Employee [] employee = new Employee[10];

    public static void showListOfEmployeesWithAllInformation() {
        for (int i=0;i<employee.length;i++ ) {
            if (employee[i] != null) {
                System.out.println(employee[i]);
            }
        }
    }
    public static void makelistOfEmployeesBySurname() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullName());
            }
        }
    }
    public static Employee  findEmployeeWithMinSalary() {
        int minSalary = (int) employee[0].getSalary();
        int emp = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < minSalary) {
                minSalary = (int) employee[i].getSalary();
                emp = i;
            }
        }
        return employee[emp];
    }
    public static void showEmployeeWithMinSalary (){
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
    }
    public static Employee  findEmployeeWithMaxSalary() {
        int maxSalary = (int) employee[0].getSalary();
        int em = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > maxSalary) {
                maxSalary = (int) employee[i].getSalary();
                em = i;
            }
        }
        return employee[em];
    }
    public static void showEmployeeWithMaxMaxSalary (){
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
    }

    public static int countAllSalaryPerMonth() {
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i]!=null){
            total = (int) (total + employee[i].getSalary());
            }
        }
        return total;
    }
    public static void printAllSalaryPerMonth() {
        System.out.println("Сумма зарплат за месяц: " + countAllSalaryPerMonth());
    }
    public static int countAverageValueOfSalaryPerMonth(int total) {
        countAllSalaryPerMonth();
        int index = 0;
        int averageSalary = 0;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                index++;
            } else if (employee[i] == null) {
                index = index;
            }
        }
        averageSalary = total / index;
            return averageSalary;
    }
    public static void printAverageSalaryPerMonth(){
        System.out.println("Среднее значение зарплаты за месяц: " + countAverageValueOfSalaryPerMonth(countAllSalaryPerMonth()));
    }


    public static void main(String[] args) {

        employee [0] = new Employee("Иванов Иван Иванович", 1, 2222);
        employee [1] = new Employee("Петров Петр Петрович", 2, 1350);
        employee [2] = null;
        employee [3] = new Employee("Довыдов Довыд Довыдович", 3, 2552);
        employee [4] = new Employee("Любанова Любовь Ивановна", 3, 2290);
        employee [5] = new Employee("Иванова Иванесса Ивановна", 5, 3246);
        employee [6] = new Employee("Годзилова Годзила Годзиловна", 4, 2333);
        employee [7] = new Employee("Кротов Крот Кротович", 2, 5534);
        employee [8] = new Employee("Суркова Срина Суркововна", 1, 1322);
        employee [9] = new Employee("Дуралеева Давидива Давидовна", 2, 2222);
        showListOfEmployeesWithAllInformation();
        printAllSalaryPerMonth();
        showEmployeeWithMinSalary();
        showEmployeeWithMaxMaxSalary();
        printAverageSalaryPerMonth();
        makelistOfEmployeesBySurname();

    }
}


