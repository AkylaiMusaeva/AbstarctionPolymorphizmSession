package Task2;

import java.util.Arrays;

/**Beast деген абстрактный класс тузобуз
 полеси: name
 методу: attack("attacking");
 жана ал класстан тараган Tiger, Gepard, Wolf
 полеси: weight;
 методу: speed();
 1ден объект тузунуз.
 Баарын массивке салып туруп,
 анан консольго чыгарыныз.*/
public class Main {
    public static void main(String[] args) {
        Beast tiger=new Tiger("Toronto",60);
        Beast gepard=new Gepard("George",120);
        Beast wolf=new Wolf("William",80);
        Beast []beasts={tiger,gepard,wolf};
        System.out.println(Arrays.toString(beasts));


    }
}
