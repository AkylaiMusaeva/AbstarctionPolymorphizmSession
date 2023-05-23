package Task1;

public abstract class  Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }
    public Device(){
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sound(){
        System.out.println("Every phone should have a sound function");
    }

    @Override
    public String toString() {
        return "Task1.Device{" +
                "name='" + name + '\'' +
                '}';
    }
}
