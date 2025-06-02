public class Employee extends Person {
    String empId;
    int salary;

    public Employee(String name, String dob, String empId, int salary) {
        super(name, dob); // Call parent constructor
        this.empId = empId;
        this.salary = salary;
    }

    public void displayDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("iram", "2005-05-08", "EMP101", 40000);
        e.displayDetails();
    }
}
