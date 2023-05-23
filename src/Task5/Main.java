package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Akylai", "Musaeva", 21, "akumusaeva01@gmail.com", 702790666, "Java-10");
        Student student2 = new Student("Munara", "Alisheva", 19, "munara@gmail.com", 774546985, "Java-10");
        Student student3 = new Student("Aizada", "Chokoevna", 20, "azadaa@gmail.com", 772365478, "Java-10");
        Student[] students = {student1, student2, student3};

        for (Student s : students) {
            System.out.println(s);
            s.live();
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
        Person teacher1 = new Teacher("Valentina", "Shevchenko", 32, "valyaaa@gmail.com", 222451245, new Student[]{student1, student3});
        Person teacher2 = new Teacher("Olga", "Ivanovna", 64, "olya@gmail.com", 556474145, new Student[]{student2});
        Person[] teachers = {teacher1, teacher2};
        for (Person t : teachers) {
            System.out.println(t);
            t.live();
        }


        System.out.println("\n\nFIND AN EMAIL OWNER");
        for (Student s : students) {
            s.getInfoByEmail("akumusaeva01@gmail.com");
        }for(Person t:teachers){
            t.getInfoByEmail("olya@gmail.com");
        }

        


    }
}
