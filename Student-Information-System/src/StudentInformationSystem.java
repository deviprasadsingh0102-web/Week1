import Student;
import java.util.*;

public class StudentInformationSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1.Add 2.View 3.Search 4.Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: add(); break;
                case 2: view(); break;
                case 3: search(); break;
            }
        } while(choice!=4);
    }

    static void add(){
        System.out.print("ID: ");
        int id=sc.nextInt(); sc.nextLine();
        System.out.print("Name: ");
        String name=sc.nextLine();
        System.out.print("Age: ");
        int age=sc.nextInt(); sc.nextLine();
        System.out.print("Course: ");
        String course=sc.nextLine();
        students.add(new Student(id,name,age,course));
    }

    static void view(){
        for(Student s:students) System.out.println(s);
    }

    static void search(){
        System.out.print("Enter ID: ");
        int id=sc.nextInt();
        for(Student s:students){
            if(s.getId()==id){ System.out.println(s); return; }
        }
        System.out.println("Not found");
    }
}
