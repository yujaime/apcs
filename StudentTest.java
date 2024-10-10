import java.util.Scanner;

public class StudentTest {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String args[]) {
    
    Student Stu1 = new Student();
    System.out.println("Name: " + Stu1.getName());
    System.out.println("OSIS: " + Stu1.getOSIS());
    System.out.println("Grade Level: " + Stu1.getGrade());
    
    System.out.println("Input name: ");
    String n = sc.nextLine();
    System.out.println("Input grade level: ");
    String g = sc.nextLine();
    Student stu2 = new Student(n,3093,g);
    System.out.println("Name: " + stu2.getName());
    System.out.println("OSIS: " + stu2.getOSIS());
    System.out.println("Grade Level: " + stu2.getGrade());
  }
}