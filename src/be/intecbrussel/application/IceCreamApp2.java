package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamApp2 {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(2,3,5);
        Stock stock = new Stock();
        stock.setMagni(2);
        stock.setIceRockets(1);
        stock.setBalls(4);
        stock.setCones(5);

        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList,stock);

        Eatable[] eatables = new Eatable[5];

        try {
            eatables[0] = iceCreamSeller.orderIceRocket();

        } catch (NoMoreIceCreamException e){
            e.printStackTrace();
        }

        try {
            eatables[1] = iceCreamSeller.orderIceRocket();

        } catch (NoMoreIceCreamException e){
            e.printStackTrace();
        }

        try {
            eatables[2] = iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.MOKKA, Cone.Flavor.CHOCOLATE});

        } catch (NoMoreIceCreamException e){
            e.printStackTrace();
        }

        try {
            eatables[3] = iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);

        } catch (NoMoreIceCreamException e){
            e.printStackTrace();
        }

        try {
            eatables[4] = iceCreamSeller.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);

        } catch (NoMoreIceCreamException e){
            e.printStackTrace();
        }

        for (Eatable eatable : eatables) {
            if (eatable != null) {
                eatable.eat();
            }
        }

        System.out.println("Profit: " + iceCreamSeller.getProfit());
    }
}
