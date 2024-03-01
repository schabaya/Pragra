package feb27;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Peter", "peter@example.com", 35, "US"));
        employees.add(new Employee("John", "john@example.com", 23, "Canada"));
        employees.add(new Employee("Sara", "sara@example.com", 44, "India"));
        employees.add(new Employee("Maria", "maria@example.com", 50, "Spain"));
        employees.add(new Employee("Alex", "alex@example.com", 10, "Canada"));

        System.out.println("Employees over the age of 30:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.age > 30) {
                System.out.println(employee);
            }
        }

        System.out.println("\nEmployees from Canada:");
        System.out.println("\nEmployees from Canada:");
        iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if ("Canada".equals(employee.country)) {
                System.out.println(employee);
            }
        }
    }
}