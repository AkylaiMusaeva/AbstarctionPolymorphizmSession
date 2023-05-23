package Task2;

public class Gepard extends Beast{
    private int weight;
    public Gepard(String name,int weight){
        super(name);
        this.weight=weight;
    }
    public Gepard(){

    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public  void speed(){
        System.out.println("Gepard runs so fast");
    }

    @Override
    public String toString() {
        return "\nGepard{" +
                "name='" + getName() + '\'' +
                "weight=" + weight +
                '}';
    }
}
