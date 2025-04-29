package java;

public class Student_course {
    String course;
    int marks;
    String name;

    Student_course(String course, int marks, String name) {
        this.course = course;
        this.marks = marks;
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);

        System.out.println("===================================");
    }

    public static void main(String[] args) {
        System.out.println("Sem 1 \n ");
        Student_course s1 = new Student_course("Java", 90, "Yaseen");
        s1.display();
        s1 = new Student_course("CN", 95, "Yaseen");
        s1.display();
        System.out.println("Sem 2 \n ");
        s1 = new Student_course("C++", 85, "Yaseen");
        s1.display();
        s1 = new Student_course("Python", 80, "Yaseen");
        s1.display();

    }

}
