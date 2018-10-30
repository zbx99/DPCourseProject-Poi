package goods;

import java.util.ArrayList;

public class GreenMilkTea extends MilkTea {
    public GreenMilkTea(String temperature, String sweetness, double price, ArrayList<Integer> topping) {
        super(temperature, sweetness, price, topping);
        this.setName("Green Milk Tea");

        StringBuffer toppings = new StringBuffer("");
        for (String temp : this.getTopping()) {
            toppings.append(temp);
            toppings.append(" ");
        }
    }

}
