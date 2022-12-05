public class Main {
    public static void main(String[] args) {
        Employee[] human = new Employee[10];
        human[0] = new Employee("Иванов Иван Иванович", 1, 35000);
        human[1] = new Employee("Иванов Сергей Андреевич", 1, 33000);
        human[2] = new Employee("Алексеев Николай Андреевич", 2, 30000);
        human[3] = new Employee("Федоров Федор Алексеевич", 2, 37000);
        human[4] = new Employee("Андреев Андрей Александрович", 3, 30500);
        human[5] = new Employee("Андреев Владислав Александрович", 3, 30500);
        human[6] = new Employee("Еремин Антон Михайлович", 4, 40000);
        human[7] = new Employee("Егоров Петр Евгеньевич", 4, 45000);
        human[8] = new Employee("Алексеев Александр Витальевич", 5, 39000);
        human[9] = new Employee("Степанов Максим Петрович", 5, 28000);
        Employee.listEmployee(human);
        Employee.listSalary(human);
        Employee.listSalaryMin(human);
        Employee.listSalaryMax(human);
        Employee.name(human);
    }
}
