package Task2;

public class Wolf extends Beast{
    private int weight;
    public Wolf(String name,int weight){
        super(name);
        this.weight=weight;
    }
    public Wolf(){

    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public  void speed(){
        System.out.println("Wolf's speed also medium");
    }

    @Override
    public String toString() {
        return "\nWolf{" +
                "name='" + getName() + '\'' +
                "weight=" + weight +
                '}';
    }
}

