package be.intecbrussel.eatables;

public class Magnum implements Eatable{
    private MagnumType type;

    public Magnum() {
        // Default waarde instellen zodat we geen null pointer exceptions krijgen.
        this(MagnumType.MILKCHOCOLATE);
    }

    public Magnum(MagnumType magnumType) {
        this.type = magnumType;
    }

    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println("Eating a " + type + " Magnum");
    }

    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES;
    }
}
