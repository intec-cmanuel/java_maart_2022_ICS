package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone = new Cone(flavors);

        // Zelfgekozen profit van een cone
        double profit = flavors.length * priceList.getBallPrice() * .25;
        totalProfit += profit;

        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();

        // Zelfgekozen profit van een ijsje
        double profit = priceList.getRocketPrice() * .30;
        totalProfit += profit;

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);

        // Zelfgekozen profit van een magnum
        double profit = priceList.getMagnumPrice(magnumType) * .50;
        totalProfit += profit;

        return magnum;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
