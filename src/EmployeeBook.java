

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void addEmployee(Employee employee) {
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                k++;
                break;
            }
        }
        if (k == 0) {
            System.out.println("Нет вакантных мест");
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void printAllEmployeesData() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateSumSalaryInMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee[] findMinSalaryEmployee() {
        double min = employees[0].getSalary();
        Employee[] emplMin = new Employee[employees.length];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == min) {
                emplMin[i] = employees[i];
                if (emplMin[i] != null) {
                    k++;
                }
            }
        }
        Employee[] emplMinFinal = new Employee[k];
        int j = 0;
        for (int i = 0; i < emplMin.length; i++) {
            if (emplMin[i] != null) {
                emplMinFinal[j] = emplMin[i];
                j++;
            }
        }
        return emplMinFinal;
    }

    public Employee[] findMaxSalaryEmployee() {
        double max = employees[0].getSalary();
        Employee[] emplMax = new Employee[employees.length];
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == max) {
                emplMax[i] = employees[i];
                if (emplMax[i] != null) {
                    k++;
                }
            }
        }
        Employee[] emplMaxFinal = new Employee[k];
        int j = 0;
        for (int i = 0; i < emplMax.length; i++) {
            if (emplMax[i] != null) {
                emplMaxFinal[j] = emplMax[i];
                j++;
            }
        }
        return emplMaxFinal;
    }

    public double middleSalaryInMonth() {
        return calculateSumSalaryInMonth() / employees.length;
    }

    public void printAllFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
        }
    }

    public void indexSalaryTotal(double percent) {
        for (Employee employee : employees) {
            double salary = employee.getSalary() * (100 + percent) / 100;
            employee.setSalary(salary);
        }
    }

    public Employee[] minSalaryEmployeeInDepartment(int department) {
        Employee[] employeeOfDep = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employeeOfDep[i] = employees[i];
            }
        }
        return employeeOfDep;
        //employeeOfDep.findMinSalaryEmployee();
    }
    /*



    public Employee maxSalaryEmployeeInDepartment(int department) {
        // использована упрощенная модель для одного сотрудника
        double max = employees[0].getSalary();
        Employee employeeMaxInDep = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() >= max) {
                max = employee.getSalary();
                employeeMaxInDep = employee;
            }
        }
        return employeeMaxInDep;
    }

    public double sumSalaryInDepartment(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void IndexSalaryInDepartment(double percent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double salary = employee.getSalary() * (100 + percent) / 100;
                employee.setSalary(salary);
            }
        }
    }

    public void printAllEmployeesDataInDepartmentWithinDep(int department) {
        System.out.println("Список сотрудников отдела " + department + ":");
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ФИО - " + employee.getFullName() + ", зарплата " + employee.getSalary() + ", ID " + employee.getId());
            }
        }
    }

    public void belowSalaryEmployee(double num) {
        for (Employee employee : employees) {
            if (employee.getSalary() < num) {
                System.out.println("ID " + employee.getId() + " ФИО - " + employee.getFullName() + ", зарплата " + employee.getSalary());
            }
        }
    }

    public void aboveSalaryEmployee(double num) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= num) {
                System.out.println("ID " + employee.getId() + " ФИО - " + employee.getFullName() + ", зарплата " + employee.getSalary());
            }
        }
    }*/
}
