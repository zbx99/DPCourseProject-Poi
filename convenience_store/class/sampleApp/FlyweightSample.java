package sampleApp;

import flyweight.FlyweightPattern;

public class FlyweightSample {
    public static void main(String[] args)
    {
        FlyweightPattern flyweightPattern=new FlyweightPattern();
        System.out.println("打印五种商品图案共9次：");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000001");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000001");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000001");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000002");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000003");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000003");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000004");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000004");
        System.out.println("\n");
        flyweightPattern.showFlyweight("000005");
        System.out.println("\n");
        System.out.print("产生的元素数量为：  "+flyweightPattern.showFlyweightSize());
    }
}
