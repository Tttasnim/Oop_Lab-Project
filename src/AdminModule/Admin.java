package AdminModule;

import Classes.DIU;
import Classes.Lecturer;
import Classes.Student;

import java.util.Scanner;

public class Admin {
     String userName = "admin";
     String password = "admin";

    Scanner in = new Scanner(System.in);

    static void template(){
        System.out.println("\n------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                      Daffodil International Classes.University                                         |");
        System.out.println("------------------------------------------------------------------------------------------------------------------\n");
    }

     void validLogin(){
         System.out.print("Enter admin username: ");
         String userName = in.nextLine();
         in.nextLine();
         System.out.print("Enter admin password: ");
         String password = in.nextLine();
         in.nextLine();
         menu();
     }
     void menu() {
        int option;
        do{
            template();
            System.out.println("  *** AdminModule.Admin Section ***");
            System.out.println("      1. Show");
            System.out.println("      2. Add");
            System.out.println("      3. Remove");
            System.out.println("      4. Logout");
            System.out.print("\n  Choose an option: ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    int option1;
                    do{
                        System.out.println("\n-------------------------------\n");
                        System.out.println("      1. Show Classes.Student");
                        System.out.println("      2. Show Classes.Lecturer");
                        System.out.println("      3. Back");
                        System.out.print("\n  Choose an option: ");
                        option1 =in.nextInt();
                        switch (option1) {
                            case 1:
                                Student.showStudent();
                                break;
                            case 2:
                                Lecturer.showLecturer();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.print("Choose an correct option: ");
                                break;
                        }
                    }while( option1 != 3 );
                    break;
                case 2:

                    int option2;
                    do{
                        System.out.println("\n-------------------------------\n");
                        System.out.println("      1. Add Classes.Student");
                        System.out.println("      2. Add Classes.Lecturer");
                        System.out.println("      3. Back");
                        System.out.print("\n  Choose an option: ");
                        option2 =in.nextInt();
                        switch (option2) {
                            case 1:
                                Student.addStudent();
                                break;
                            case 2:
                                Lecturer.addLecturer();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.print("Choose an correct option: ");
                                break;
                        }
                    }while( option2 != 3 );
                    break;
                case 3:
                    int option3;
                    do{
                        System.out.println("\n-------------------------------\n");
                        System.out.println("      1. Remove Classes.Student");
                        System.out.println("      2. Remove Classes.Lecturer");
                        System.out.println("      3. Back");
                        System.out.print("\n  Choose an option: ");
                        option3 =in.nextInt();
                        switch (option3) {
                            case 1:
                                Student.removeStudent();
                                break;
                            case 2:
                                Lecturer.removeLecturer();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.print("Choose an correct option: ");
                                break;
                        }
                    }while( option3 != 3 );
                    break;
                case 4:
                    break;
                default:
                    System.out.print("Choose an correct option: ");
                    break;
            }
        }while ( option != 4);
    }
    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }
}
