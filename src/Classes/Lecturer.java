package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecturer extends Person{

    Scanner in = new Scanner(System.in);
    String designation ,qualification;

    static ArrayList<Lecturer> lecturers = new ArrayList<>();

    public Lecturer(String name, String department, String contact, String designation, String qualification) {
        super(name, department, contact);
        this.designation = designation;
        this.qualification = qualification;
    }

    public static void showLecturer(){
        System.out.println("  |  ID  |  Name  |  Department  |  ContactNo.  |  Designation  |  Qualification  |  ");
        for(Lecturer i : lecturers){
            if(i.status == "Active") {
                System.out.println("\n  |  " + i.id + "  |  " + i.name + "  |  " + i.department + "  |  " +
                        i.contact + "  |  " + i.designation + "  |  " + i.qualification);
            }
        }
    }

    public static void addLecturer(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lecturer's name : ");
        String name = in.nextLine();
        in.nextLine();
        System.out.print("Enter lecturer's department : ");
        String department = in.nextLine();
        in.nextLine();
        System.out.print("Enter lecturer's contactNo. : ");
        String contact = in.nextLine();
        in.nextLine();
        System.out.print("Enter lecturer's designation : ");
        String designation = in.nextLine();
        in.nextLine();
        System.out.print("Enter lecturer's qualification : ");
        String qualification = in.nextLine();
        in.nextLine();
        lecturers.add(new Lecturer(name, department, contact, designation, qualification));
        System.out.println("Classes.Lecturer added successfully.");
    }

    public static void removeLecturer(){
        Scanner in = new Scanner(System.in);
        showLecturer();
        int id = in.nextInt();
        System.out.print("Enter lecturer Id : ");
        Lecturer lecturer = lecturers.get(id);
        lecturer.status = "Inactive";
        System.out.println("Classes.Lecturer removed successfully.");
    }
    @Override
    public void show() {
        showLecturer();
    }

    @Override
    public void add() {
        addLecturer();
    }

    @Override
    public void remove() {
        removeLecturer();
    }
}
