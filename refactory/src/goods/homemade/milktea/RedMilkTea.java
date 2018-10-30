package goods.homemade.milktea;

import java.util.ArrayList;

public class RedMilkTea extends MilkTea {
    public RedMilkTea(String temperature, String sweetness, double price, ArrayList<Integer> topping) {
        super(temperature, sweetness, price, topping);
        this.setName("Red Milk Tea");

        StringBuffer toppings = new StringBuffer("");
        for (String temp : this.getTopping()) {
            toppings.append(temp);
            toppings.append(" ");
        }

    }
}
