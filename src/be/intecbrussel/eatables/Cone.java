package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{
    private Flavor[] balls;

    public Cone() {
        this(new Flavor[]{Flavor.MOKKA});
    }

    public Cone(Flavor[] flavors) {
        this.balls = flavors;
    }

    @Override
    public void eat() {
        System.out.println("Eating a " + Arrays.toString(balls) + " Cone");
    }

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;
    }
}
