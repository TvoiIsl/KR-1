public class Employee {
    private final String namePerson;
    private int division;
    private int salary;

    static int id = 0;


    public Employee(String namePerson, int division, int salary) {
        this.namePerson = namePerson;
        this.division = division;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public int getDivision() {
        return division;
    }

    public int getSalary() {
        return salary;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + namePerson + " Отдел: " + division + " Зарплата: " + salary;
    }

    public static void listEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void listSalary(Employee[] employees) {
        int sum = 0;
        int averageSum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee employee = employees[i];
                sum = sum + employee.salary;
            }
        }
        System.out.println("Сумма затрат на зарплаты = " + sum);
        averageSum = sum / employees.length;
        System.out.println("Средняя зарплата = " + averageSum);
    }

    public static void listSalaryMin(Employee[] employees) {
        int min = 50000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee employee = employees[i];
                if (min > employee.salary) {
                    min = employee.salary;
                    id = i;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employees[id]);
    }

    public static void listSalaryMax(Employee[] employees) {
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee employee = employees[i];
                if (max < employee.salary) {
                    max = employee.salary;
                    id = i;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employees[id]);
    }

    public static void name(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee employee = employees[i];
                System.out.println("ФИО сотрудника: " + employee.namePerson);
            }
        }
    }
}
