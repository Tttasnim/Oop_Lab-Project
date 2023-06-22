package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{

    Scanner in = new Scanner(System.in);

    String session;
    double cgpa;

    static ArrayList<Student> students = new ArrayList<>();
    public Student(String name, String department, String contact, String session, double cgpa) {
        super(name, department, contact);
        this.session = session;
        this.cgpa = cgpa;
    }

    public static void showStudent(){
        System.out.println("\n  |  ID  |  Name  |  Department  |  ContactNo.  |  Session  |  Cgpa  |  ");
        for(Student i : students){
            if(i.status == "Active") {
                System.out.println("  |  " + i.id + "  |  " + i.name + "  |  " + i.department + "  |  " +
                        i.contact + "  |  " + i.session + "  |  " + i.cgpa);
            }
        }
    }

    public static void addStudent(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's name : ");
        String name = in.nextLine();
        in.nextLine();
        System.out.print("Enter student's department : ");
        String department = in.nextLine();
        in.nextLine();
        System.out.print("Enter student's contactNo. : ");
        String contact = in.nextLine();
        in.nextLine();
        System.out.print("Enter student's session : ");
        String session = in.nextLine();
        in.nextLine();
        System.out.print("Enter student's cgpa : ");
        double cgpa = in.nextDouble();
        in.nextLine();
        students.add(new Student(name, department, contact, session, cgpa));
        System.out.println("Classes.Student added successfully.");
    }

    public static void removeStudent(){
        Scanner in = new Scanner(System.in);
        showStudent();
        int id = in.nextInt();
        System.out.print("Enter student Id : ");
        Student student = students.get(id);
        student.status = "Inactive";
        System.out.println("Classes.Student removed successfully.");
    }
    @Override
    public void show() {
        showStudent();
    }

    @Override
    public void add() {
        addStudent();
    }

    @Override
    public void remove() {
        removeStudent();
    }
}
