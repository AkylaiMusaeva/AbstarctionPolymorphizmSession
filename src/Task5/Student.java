package Task5;

public class Student extends Person{
    private String group;

    public Student(String firstName, String lastName, int age, String email, long phoneNumber, String group) {
        super(firstName, lastName, age, email, phoneNumber);
        this.group = group;
    }
    public Student(){

    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String firstName, String lastName, int age, String email, long phoneNumber) {
        super(firstName, lastName, age, email, phoneNumber);
    }

    @Override
    public void live() {
        System.out.println(getFirstName()+" is studying");
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
