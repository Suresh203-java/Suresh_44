import java.util.HashMap;
import java.util.Scanner;
public class hashmapdemo3 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> studentDetails = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String id = sc.nextLine();
                    HashMap<String, String> details = new HashMap<>();
                    System.out.print("Enter name: ");
                    details.put("Name", sc.nextLine());
                    System.out.print("Enter roll number: ");
                    details.put("Roll No", sc.nextLine());
                    System.out.print("Enter age: ");
                    details.put("Age", sc.nextLine());
                    System.out.print("Enter phone number: ");
                    details.put("Phone Number", sc.nextLine());
                    System.out.print("Enter email: ");
                    details.put("Email", sc.nextLine());
                    System.out.print("Enter address: ");
                    details.put("Address", sc.nextLine());
                    System.out.print("Enter country: ");
                    details.put("Country", sc.nextLine());
                    studentDetails.put(id, details);
                    System.out.println("Student added.");
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    id = sc.nextLine();
                    if (studentDetails.containsKey(id)) {
                        HashMap<String, String> student = studentDetails.get(id);
                        System.out.println("Name: " + student.get("Name"));
                        System.out.println("Roll No: " + student.get("Roll No"));
                        System.out.println("Age: " + student.get("Age"));
                        System.out.println("Phone Number: " + student.get("Phone Number"));
                        System.out.println("Email: " + student.get("Email"));
                        System.out.println("Address: " + student.get("Address"));
                        System.out.println("Country: " + student.get("Country"));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    id = sc.nextLine();
                    if (studentDetails.containsKey(id)) {
                        HashMap<String, String> student = studentDetails.get(id);
                        System.out.print("Enter new name: ");
                        student.put("Name", sc.nextLine());
                        System.out.print("Enter new roll number: ");
                        student.put("Roll No", sc.nextLine());
                        System.out.print("Enter new age: ");
                        student.put("Age", sc.nextLine());
                        System.out.print("Enter new phone number: ");
                        student.put("Phone Number", sc.nextLine());
                        System.out.print("Enter new email: ");
                        student.put("Email", sc.nextLine());
                        System.out.print("Enter new address: ");
                        student.put("Address", sc.nextLine());
                        System.out.print("Enter new country: ");
                        student.put("Country", sc.nextLine());
                        System.out.println("Student updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    id = sc.nextLine();
                    if (studentDetails.containsKey(id)) {
                        studentDetails.remove(id);
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}