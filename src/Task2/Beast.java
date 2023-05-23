package Task2;

public abstract class Beast {
    private String name;

    public Beast(String name) {
        this.name = name;
    }
    public Beast(){

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void attack(){
        System.out.println("attacking");
    }

    @Override
    public String toString() {
        return "Beast{" +
                "name='" + name + '\'' +
                '}';
    }
}

