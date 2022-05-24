package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        if (stock.getCones() < 1) {
            throw new NoMoreIceCreamException("Out of cones");
        }

        if (stock.getBalls() < flavors.length) {
            throw new NoMoreIceCreamException("Not enough balls of icecream");
        }

        return prepareCone(flavors);
    }

    private Cone prepareCone(Cone.Flavor[] flavors) {
        Cone cone = new Cone(flavors);
        stock.setCones(stock.getCones() - 1);
        stock.setBalls(stock.getBalls() - flavors.length);
        profit += flavors.length * priceList.getBallPrice() * .30;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        if (stock.getIceRockets() < 1) {
            throw new NoMoreIceCreamException("Out of ice rockets");
        }

        return prepareIceRocket();
    }

    private IceRocket prepareIceRocket() {
        IceRocket iceRocket = new IceRocket();
        stock.setIceRockets(stock.getIceRockets() - 1);
        profit += priceList.getRocketPrice() * .50;
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        if (stock.getMagni() < 1) {
            throw new NoMoreIceCreamException("Out of magni");
        }

        return prepareMagnum(magnumType);
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        stock.setMagni(stock.getMagni() - 1);
        profit += priceList.getMagnumPrice(magnumType) * .80;
        return magnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
