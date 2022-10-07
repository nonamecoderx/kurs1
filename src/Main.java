import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Sidorov Leonid Sergeevich", 4, 24500);
        employee1.displayId();// проверяем id первого сотрудника
        Employee employee2 = new Employee("Petrov Leonid Sergeevich", 2, 24500);
        employee2.displayId();// проверяем id второго сотрудника
        System.out.println(employee1);
        employee1.setSalary(25200);// меняем зарплату первого сотрудника
        System.out.println(employee1);

        Employee[] firm = new Employee[10];
        firm[0] = new Employee("Ivanov Petr Sergeevich", 2, 24000);
        firm[1] = new Employee("Petrov Ivan Olegovich", 1, 32000);
        firm[2] = new Employee("Glinka Sergei Ivanovich", 4, 22000);
        firm[3] = new Employee("Sergeev Petr Borisovich", 3, 41000);
        firm[4] = new Employee("Kozlov Nikolay Sergeevich", 5, 33000);
        firm[5] = new Employee("Petrov Aleksei Sergeevich", 2, 24000);
        firm[6] = new Employee("Alekseev Ivan Olegovich", 1, 32000);
        firm[7] = new Employee("Sumakov Sergei Petrovich", 4, 22000);
        firm[8] = new Employee("Kurashev Vasiliy Borisovich", 3, 42000);
        firm[9] = new Employee("Petrov Nikolay Olegovich", 5, 33000);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Arrays.stream(firm).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        getSum(firm);
        getMax(firm);
        getMin(firm);
    }

    public static int getSum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Общая сумма затрат на зарплату = " + sum);
        return sum;
    }

    public static int getMax(Employee[] employees) {
        int maxSalary = 0;
        String worker = "null";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                worker = employees[i].getName();
            }
        }
        System.out.println("максимальная зп - " + maxSalary +" у сотрудника "+ worker);
        return maxSalary;
    }
    public static int getMin(Employee[] employees) {
        int maxSalary = 1000000;
        String worker = "null";
        for (int i = employees.length - 1; i >= 0; i--) {
            if (employees[i].getSalary() < maxSalary) {
                maxSalary = employees[i].getSalary();
                worker = employees[i].getName();
            }
        }
        System.out.println("миниимальная зп - " + maxSalary +" у сотрудника "+ worker);
        return maxSalary;
    }
}
