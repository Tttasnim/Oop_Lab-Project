package Classes;

public abstract class Person {

    String name, department, contact, status;
    int id;

    static int id1 = 0;
    DIU diu;
    public Person(String name, String department, String contact) {
        this.name = name;
        this.id = id1;
        id1++;
        this.department = department;
        this.contact = contact;
        this.status = "Active";
    }

    public abstract void show();

    public abstract void add();

    public abstract void remove();
}
