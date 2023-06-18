public class Employee {
    String fullName;
    int department;
    double salary;
    private final int id;


    public static int counter = 0;

    public Employee(String fullName, int department, double salary, int id) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return fullName + " " + department + " " + salary + " " + id;
    }
}
