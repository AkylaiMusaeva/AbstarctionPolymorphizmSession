package Task1;

/**Device деген класс тузуп алабыз,
полеси: name;
методу: sound();
Phone деген класс мурастасын,
поле: price;
метод: takePhoto();
Device деп объект тузуп алып,
поле жана методторун чакырып
корунуз, sound() methodту @Override
кылабыз*/
public class Main {
    public static void main(String[] args) {
        Phone phone=new Phone("Iphone",1200);
        System.out.println(phone.toString());
        phone.takePhoto();
        phone.sound();


    }
}