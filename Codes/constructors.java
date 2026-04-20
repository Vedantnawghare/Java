public class Student {
	String name;

    // Constructor
    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vishnu");
        s1.display();
    }
}
