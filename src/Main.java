public class Main {
   static Employee [] employee = new Employee[10];

    public static void makeListOfEmployees(Employee[] arr) {
        for (Object empl : arr) {
            System.out.println(empl);
        }
    }
    public static void makelistOfEmployeesBySurname(Employee[]arr) {
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i].getFullName());
        }
    }
    public static StringBuilder  countMinSalary(Employee[]arr) {
        int minSalary = (int) arr[0].getSalary();
        StringBuilder employeeWithMinSalary = new StringBuilder();
        for (int i = 0; i<arr.length; i++){
            if (arr [i].getSalary()< minSalary) {
                minSalary = (int) arr[i].getSalary();
                employeeWithMinSalary.setLength(0);
                employeeWithMinSalary.append(arr[i].getFullName()).append(" ").append(minSalary);
            }
        }
        return employeeWithMinSalary;
    }
    public static void printMinSalary (Employee[]arr){
        System.out.println("Сотрудник с минимальной зарплатой: " + countMinSalary(arr));
    }
    public static StringBuilder  countMaxSalary(Employee[]arr) {
        int maxSalary = (int) arr[0].getSalary();
        StringBuilder employeeWithMaxSalary = new StringBuilder();
        for (int i = 0; i<arr.length; i++){
            if (arr[i].getSalary()>maxSalary) {
                maxSalary = (int) arr[i].getSalary();
                employeeWithMaxSalary.setLength(0);
                employeeWithMaxSalary.append(arr[i].getFullName()).append(" ").append(maxSalary);;
            }
        }
        return employeeWithMaxSalary;
    }
    public static void printMaxSalary (Employee[]arr){
        System.out.println("Сотрудник с максимальной зарплатой: " + countMaxSalary(arr));
    }

    public static int countAllSalaryPerMonth(Employee[] salar) {
        int total = 0;
        for (int i = 0; i < salar.length; i++) {
            total = (int) (total + salar[i].getSalary());
        }
        return total;
    }
    public static void printAllSalaryPerMonth(Employee[]employees) {
        System.out.println("Сумма зарплат за месяц: " + countAllSalaryPerMonth(employees));
    }
    public static int countAverageValueOfSalaryPerMonth(Employee[]salar) {
        int total = 0;
        for (int i = 0; i < salar.length; i++) {
            total = (int) (total + salar[i].getSalary());
        }
        int averageSalary = total/salar.length;
        return averageSalary;
    }
    public static void printAverageSalaryPerMonth(Employee[]employees){
        System.out.println("Среднее значение зарплаты за месяц: " + countAverageValueOfSalaryPerMonth(employees));
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
        employee [8] = new Employee("Суркова Сурина Суркововна", "1", 1322);
        employee [9] = new Employee("Дуралеева Давидива Давидовна", "2", 2222);

        makeListOfEmployees(employee);
        printAllSalaryPerMonth(employee);
        printMinSalary(employee);
        printMaxSalary(employee);
        printAverageSalaryPerMonth(employee);
        makelistOfEmployeesBySurname(employee);
    }
}


