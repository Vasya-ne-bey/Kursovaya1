public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee sergey = new Employee("Sergey", "Ivanov", "Ivanovich", 3, 100000);
        Employee sergey2 = new Employee("Sergey2", "Ivanov", "Ivanovich", 3, 80000);
        Employee sergey3 = new Employee("Sergey3", "Ivanov", "Ivanovich", 3, 150000);
        Employee sergey4 = new Employee("Sergey4", "Ivanov", "Ivanovich", 3, 50000);
        Employee sergey5 = new Employee("Sergey5", "Ivanov", "Ivanovich", 3, 100000);
        employees[0] = sergey;
        employees[2] = sergey2;
        employees[3] = sergey3;
        employees[4] = sergey4;
        employees[7] = sergey5;
        printEmployees();
        System.out.println();           //  [employee0,null,null,...]
        printFio();
        System.out.println(findSum());
        System.out.println(findPoorEmployee());
        System.out.println(findRichEmployee());
    }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void printFio() {
        for (int i = 0; i < employees.length; i++) {

            Employee employee = employees[i];
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getName() + " " + employee.getsurename());
            }
        }
    }

    public static int findSum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {

            if(employees[i] == null) {
                continue;
            }

            Employee employee = employees[i];
            int salary = employee.getSalary();
            sum = sum += salary;
        }
        return sum;
    }

    public static Employee findPoorEmployee() {

        Employee poorestEmployee = null;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] == null) {
                continue;
            }

            if(poorestEmployee == null) {
                poorestEmployee = employees[i];
                continue;
            }

            if (employees[i].getSalary() < poorestEmployee.getSalary()) {
                poorestEmployee = employees[i];
            }
        }
        return poorestEmployee;
    }

    public static Employee findRichEmployee() {

        Employee richestEmployee = null;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] == null) {                 // [null,null,employee2,...
                continue;
            }

            if(richestEmployee == null) {
                richestEmployee = employees[i];
                continue;
            }

            if (employees[i].getSalary() > richestEmployee.getSalary()) {
                richestEmployee = employees[i];
            }
        }
        return richestEmployee;
    }

    public static int calcMiddleSalary() {
        int averageSalary = findSum() / employees.length;
        return averageSalary;
    }
}


//Найти сотрудника с минимальной ЗП;
//Найти сотрудника с максимальной ЗП;
//Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
