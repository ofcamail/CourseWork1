public class Main {
    static Employee [] employee = new Employee[10];

    public static void makeListOfEmployees() {
        for (Object empl : employee) {
            if (employee != null) {
                System.out.println(empl);
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
    public static StringBuilder  countMinSalary() {
        int minSalary = (int) employee[0].getSalary();
        StringBuilder employeeWithMinSalary = new StringBuilder();
        for (int i = 0; i<employee.length; i++){
            if (employee [i].getSalary()< minSalary && employee[i]!=null) {
                minSalary = (int) employee[i].getSalary();
                employeeWithMinSalary.setLength(0);
                employeeWithMinSalary.append(employee[i].getFullName()).append(" ").append(minSalary);
            }
        }
        return employeeWithMinSalary;
    }
    public static void printMinSalary (){
        System.out.println("Сотрудник с минимальной зарплатой: " + countMinSalary());
    }
    public static StringBuilder  countMaxSalary() {
        int maxSalary = (int) employee[0].getSalary();
        StringBuilder employeeWithMaxSalary = new StringBuilder();
        for (int i = 0; i<employee.length; i++){
            if (employee[i].getSalary()>maxSalary && employee[i]!=null) {
                maxSalary = (int) employee[i].getSalary();
                employeeWithMaxSalary.setLength(0);
                employeeWithMaxSalary.append(employee[i].getFullName()).append(" ").append(maxSalary);;
            }
        }
        return employeeWithMaxSalary;
    }
    public static void printMaxSalary (){
        System.out.println("Сотрудник с максимальной зарплатой: " + countMaxSalary());
    }

    public static int countAllSalaryPerMonth() {
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
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
            if (employee[i] != null) {
                total = (int) (total + employee[i].getSalary());
            }
        }
        int averageSalary = total/employee.length;
        return averageSalary;
    }
    public static void printAverageSalaryPerMonth(){
        System.out.println("Среднее значение зарплаты за месяц: " + countAverageValueOfSalaryPerMonth());
    }
    public static StringBuilder indexSalary(){
        double indexSalary = 1.04;
        StringBuilder newSalar = new StringBuilder();
        int newSalary = 0;
        for (int i=0;i<employee.length;i++) {
            if (employee[i] != null) {
                newSalary = (int) (employee[i].getSalary() * indexSalary);
                newSalar.append("Зарплата после индексации: ").append("\n").append(employee[i].getFullName()).append(" ").append(newSalary).append("\n");
            }
        }
        return newSalar;
    }

    public static void printIndexSalary(){
        System.out.println(indexSalary());
    }

    public static void main(String[] args) {

        employee [0] = new Employee("Иванов Иван Иванович", "1", 2222);
        employee [1] = new Employee("Петров Петр Петрович", "2", 1350);
        employee [2] = new Employee("Николаев Николай Николаевич", "2", 2272);
        employee [3] = new Employee("Довыдов Довыд Довыдович", "3", 2552);
        employee [4] = new Employee("Любанова Любовь Ивановна", "3", 2290);
        employee [5] = new Employee("Иванова Иванесса Ивановна", "5", 3246);
        employee [6] = new Employee("Годзилова Годзила Годзиловна", "4", 2333);
        employee [7] = new Employee("Кротов Крот Кротович", "2", 5534);
        employee [8] = new Employee("Суркова Срина Суркововна", "1", 1322);
        employee [9] = new Employee("Дуралеева Давидива Давидовна", "2", 2222);
        makeListOfEmployees();
        printAllSalaryPerMonth();
        printMinSalary();
        printMaxSalary();
        printAverageSalaryPerMonth();
        makelistOfEmployeesBySurname();
        printIndexSalary();
    }
}


