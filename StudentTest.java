import java.util.Scanner;

public class StudentTest {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        
        Student Stu1 = new Student();
        System.out.println("Name: " + Stu1.getName());
        System.out.println("OSIS: " + Stu1.getOSIS());
        System.out.println("Grade Level: " + Stu1.getGrade());
        
        
  }
}