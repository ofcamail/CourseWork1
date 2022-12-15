public class Main {
    static Employee [] employee = new Employee[10];

    public static void ShowListOfEmployeesWithAllInformation() {
        for (int i=0;i<employee.length;i++ ) {
            if (employee[i] == null) {
              continue;
            }else{
                System.out.println(employee[i]);;
            }
        }
    }
    public static void makelistOfEmployeesBySurname() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {
                System.out.println(employee[i].getFullName());
            }
        }
    }
    public static StringBuilder  findEmployeeWithMinSalary() {
        int minSalary = (int) employee[0].getSalary();
        StringBuilder employeeWithMinSalary = new StringBuilder();
        for (int i = 0; i<employee.length; i++){
            if (employee[i]==null){
                continue;
            } else if (employee [i].getSalary()< minSalary && employee[i]!=null) {
                    minSalary = (int) employee[i].getSalary();
                    employeeWithMinSalary.setLength(0);
                    employeeWithMinSalary.append(employee[i].getFullName()).append(" ").append(minSalary);
            }
        }
        return employeeWithMinSalary;
    }
    public static void showEmployeeWithMinSalary (){
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
    }
    public static StringBuilder  FindEmployeeWithMaxSalary() {
        int maxSalary = (int) employee[0].getSalary();
        StringBuilder employeeWithMaxSalary = new StringBuilder();
        for (int i = 0; i<employee.length; i++){
            if (employee[i]==null){
                continue;
            }else if (employee[i].getSalary()>maxSalary) {
                maxSalary = (int) employee[i].getSalary();
                employeeWithMaxSalary.setLength(0);
                employeeWithMaxSalary.append(employee[i].getFullName()).append(" ").append(maxSalary);;
            }
            }
        return employeeWithMaxSalary;
    }
    public static void ShowEmployeeWithMaxMaxSalary (){
        System.out.println("Сотрудник с максимальной зарплатой: " + FindEmployeeWithMaxSalary());
    }

    public static int countAllSalaryPerMonth() {
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i]==null){
                continue;
            } else {
                total = (int) (total + employee[i].getSalary());
            }
        }
        return total;
    }
    public static void printAllSalaryPerMonth() {
        System.out.println("Сумма зарплат за месяц: " + countAllSalaryPerMonth());
    }
    public static int countAverageValueOfSalaryPerMonth() {
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            } else {    total = (int) (total + employee[i].getSalary());
            }
        }
        int averageSalary = total/employee.length;
        return averageSalary;
    }
    public static void printAverageSalaryPerMonth(){
        System.out.println("Среднее значение зарплаты за месяц: " + countAverageValueOfSalaryPerMonth());
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
        ShowListOfEmployeesWithAllInformation();
        printAllSalaryPerMonth();
        showEmployeeWithMinSalary();
        ShowEmployeeWithMaxMaxSalary();
        printAverageSalaryPerMonth();
        makelistOfEmployeesBySurname();

    }
}


