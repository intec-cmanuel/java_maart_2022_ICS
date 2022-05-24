package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
        this(1,1,1);
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType) {
        switch (magnumType) {
            case ALPINENUTS: return magnumStandardPrice * 1.5;
            case MILKCHOCOLATE: return magnumStandardPrice * 1.2;
            case BLACKCHOCOLATE: return magnumStandardPrice * 1.6;
            case WHITECHOCOLATE: return magnumStandardPrice * 1.7;
            case ROMANTICSTRAWBERRIES: return magnumStandardPrice * 3;
            default: return magnumStandardPrice;
        }
    }
}
