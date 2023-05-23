package Task2;

public class Tiger extends Beast{
    private int weight;
    public Tiger(String name,int weight){
        super(name);
        this.weight=weight;
    }
    public Tiger(){

    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public  void speed(){
        System.out.println("Tiger's speed is not that high");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + getName() + '\'' +
                ",weight=" + weight +
                '}';
    }
}
