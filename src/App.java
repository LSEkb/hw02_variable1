import java.util.Arrays;
import java.util.Scanner;

public class App {
    //static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Employee employees1 = new Employee("Никулин", "Юрий", "Михайлович", 1, 140);
        employeeBook.addEmployee(employees1);
        Employee employees2 = new Employee("Вицин", "Георгий", "Михайлович", 1, 130);
        employeeBook.addEmployee(employees2);
        Employee employees3 = new Employee("Моргунов", "Евгений", "Александрович", 1, 120);
        employeeBook.addEmployee(employees3);
        Employee employees4 = new Employee("Демьяненко", "Александр", "Сергеевич", 2, 100);
        employeeBook.addEmployee(employees4);
        Employee employees5 = new Employee("Селезнева", "Наталья", "Игоревна", 2, 115);
        employeeBook.addEmployee(employees5);
        Employee employees6 = new Employee("Варлей", "Наталья", "Владимировна", 2, 105);
        employeeBook.addEmployee(employees6);
        Employee employees7 = new Employee("Пуговкин", "Михаил", "Иванович", 3, 80);
        employeeBook.addEmployee(employees7);
        Employee employees8 = new Employee("Басов", "Владимир", "Павлович", 3, 80);
        employeeBook.addEmployee(employees8);
        Employee employees9 = new Employee("Гребешкова", "Нина", "Павловна", 4, 90);
        employeeBook.addEmployee(employees9);
        Employee employees10 = new Employee("Папанов", "Анатолий", "Дмитриевич", 5, 140);
        employeeBook.addEmployee(employees10);
        Employee employees11 = new Employee("Мордюкова", "Нонна", "Викторовна", 5, 90);
        employeeBook.addEmployee(employees11);

        employeeBook.deleteEmployee(2);

        //employeeBook.addEmployee(employees11);

        employeeBook.printAllEmployeesData();

        System.out.println(employeeBook.calculateSumSalaryInMonth());

        System.out.println(Arrays.toString(employeeBook.findMinSalaryEmployee()));
        System.out.println(Arrays.asList(employeeBook.findMaxSalaryEmployee()));

        System.out.println(employeeBook.middleSalaryInMonth());

        employeeBook.printAllFullNames();

        double indexPercent = 5;
        employeeBook.indexSalaryTotal(indexPercent);


        /*

        System.out.println("Средняя зарплата за месяц составила " + middleSalaryInMonth() + " руб.");
        System.out.println();
        System.out.println("Список всех сотрудников:");
        printAllFullNames();
        System.out.println();
        // Проверка работы методов курсовой со средней сложностью
        double indexPercent = 5;
        indexSalaryTotal(indexPercent);
        printAllEmployeesData(); // проверим, что зарплата проиндексировалась
        System.out.println();
        int department = 1;
        System.out.println("Минимальная зарплата в отделе " + department + " у сотрудника: " + minSalaryEmployeeInDepartment(department));
        System.out.println();
        System.out.println("Максимальная зарплата в отделе " + department + " у сотрудника: " + maxSalaryEmployeeInDepartment(department));
        System.out.println();
        System.out.println("Сумма затрат на зарплату по отделу " + department + " равна " + sumSalaryInDepartment(department) + " руб");
        System.out.println();
        IndexSalaryInDepartment(10, 1);
        printAllEmployeesDataInDepartmentWithinDep(1); // здесь же увидим и результат индексации по отделу
        System.out.println();
        double number1 = 100;
        double number2 = 120;
        System.out.println("Список сотрудников, чья зарплата ниже, чем " + number1 + ":");
        belowSalaryEmployee(number1);
        System.out.println();
        System.out.println("Список сотрудников, чья зарплата не ниже, чем " + number2 + ":");
        aboveSalaryEmployee(number2);
    }*/


    }
}

