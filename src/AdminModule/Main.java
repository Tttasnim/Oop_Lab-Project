package AdminModule;

import java.util.Scanner;

public class Main {
    static void home(){
        Scanner in = new Scanner(System.in);
        Admin admin = new Admin();
        int option;
        do{
            Admin.template();
            System.out.println("      1. Login as AdminModule.Admin");
            System.out.println("      2. Exit");
            System.out.print("\n  Choose an option: ");
            option = in.nextInt();
            switch (option){
                case 1:
                    admin.validLogin();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Choose an correct option.");
                    break;
            }
        }while ((option != 2));
    }

    public static void main(String[] args) {
        //for pre add
        //Classes.Student.students.add(new Classes.Student(name, department, contact, session, cgpa));
        //lecturers.add(new Classes.Lecturer(name, department, contact, designation, qualification));
        Main.home();
    }
}