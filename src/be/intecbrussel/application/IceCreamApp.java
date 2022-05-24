package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(2,3,5);

        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);

        Eatable[] eatables = new Eatable[5];
        eatables[0] = iceCreamSeller.orderIceRocket();
        eatables[1] = iceCreamSeller.orderIceRocket();
        eatables[2] = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA, Cone.Flavor.CHOCOLATE});
        eatables[3] = iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        eatables[4] = iceCreamSeller.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);

        for (Eatable eatable : eatables) {
            if (eatable != null) {
                eatable.eat();
            }
        }

        System.out.println("Profit: " + iceCreamSeller.getProfit());
    }
}
