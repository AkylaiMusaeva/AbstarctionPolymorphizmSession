package Task5;

import java.util.Arrays;

public class Teacher extends Person{
    Student[]students;

    public Teacher(String firstName, String lastName, int age, String email, long phoneNumber, Student[] students) {
        super(firstName, lastName, age, email, phoneNumber);
        this.students = students;
    }
    public Teacher(){

    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public Student[] getStudents() {
        return students;
    }

    @Override
    public void live() {
        System.out.println(getFirstName()+" is teaching "+ Arrays.toString(getStudents()));
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void getInfoByEmail(String email) {
        if(email.equals(getEmail())){
            System.out.println(toString());
        }

    }
}
