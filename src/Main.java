import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee1:");
        System.out.print("name: ");
        String emp1Name = scanner.nextLine();
        System.out.print("surname: ");
        String emp1Surname = scanner.nextLine();
        System.out.print("position: ");
        String emp1Position = scanner.nextLine();
        System.out.print("salary: ");
        double emp1Salary = scanner.nextDouble();
        scanner.nextLine();
        people.add(new Employee(emp1Name, emp1Surname, emp1Position, emp1Salary));

        System.out.println("Employee2:");
        System.out.print("name: ");
        String emp2Name = scanner.nextLine();
        System.out.print("surname: ");
        String emp2Surname = scanner.nextLine();
        System.out.print("position: ");
        String emp2Position = scanner.nextLine();
        System.out.print("salary: ");
        double emp2Salary = scanner.nextDouble();
        scanner.nextLine();
        people.add(new Employee(emp2Name, emp2Surname, emp2Position, emp2Salary));

        System.out.println("Student1:");
        System.out.print("name: ");
        String stu1Name = scanner.nextLine();
        System.out.print("surname: ");
        String stu1Surname = scanner.nextLine();
        System.out.print("gpa: ");
        double stu1Gpa = scanner.nextDouble();
        scanner.nextLine();
        people.add(new Student(stu1Name, stu1Surname, stu1Gpa));

        System.out.println("Student2:");
        System.out.print("name: ");
        String stu2Name = scanner.nextLine();
        System.out.print("surname: ");
        String stu2Surname = scanner.nextLine();
        System.out.print("gpa: ");
        double stu2Gpa = scanner.nextDouble();
        scanner.nextLine();
        people.add(new Student(stu2Name, stu2Surname, stu2Gpa));

        scanner.close();

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.getPosition() + ": " + person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
