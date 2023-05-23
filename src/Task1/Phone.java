package Task1;

import Task1.Device;

public class Phone extends Device {
    private int price;
    public Phone (String name,int price){
        super(name);
        this.price=price;
    }
    public Phone(){

    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void takePhoto(){
        System.out.println(getName()+" can take a photo");
    }
    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public String toString() {
        return "name=" + getName() +
                " ,price=" + price ;
    }
}
