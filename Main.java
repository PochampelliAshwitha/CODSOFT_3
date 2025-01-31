import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        boolean running = true;

        while (running) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    sms.addStudent(name, rollNumber, grade);
                }
                case 2 -> {
                    System.out.print("Enter roll number of the student to remove: ");
                    String rollNumber = scanner.nextLine();
                    sms.removeStudent(rollNumber);
                }
                case 3 -> {
                    System.out.print("Enter roll number of the student to search: ");
                    String rollNumber = scanner.nextLine();
                    sms.searchStudent(rollNumber);
                }
                case 4 -> sms.displayAllStudents();
                case 5 -> {
                    running = false;
                    System.out.println("Exiting the system.");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}