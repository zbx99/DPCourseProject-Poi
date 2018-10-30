package flyweight;

/**
 * @author 田括铜
 * @version 1.0
 * 对flyweight进行调用的类
 */
public class FlyweightPattern {
    FlyweightFactory factory=new FlyweightFactory();
    Flyweight fly1;
    Flyweight fly2;
    Flyweight fly3;
    Flyweight fly4;
    Flyweight fly5;

    /**
     * 三次咖啡两次面包，共五次
     */
    public FlyweightPattern(){
        fly1=factory.getFlyWeight("JavaCoffee");
        fly2=factory.getFlyWeight("JavaCoffee");
        fly3=factory.getFlyWeight("JavaCoffee");
        fly4=factory.getFlyWeight("ChocolateBread");
        fly5=factory.getFlyWeight("ChocolateBread");

    }

    /**
     * 输出五次图案并，获得factory中元素数量为2
     * 所以否成功使用flyweight设计模式
     * 通过创建Flyweigtpattern实体并调用showflyweight方法来打印
      */
    public void showFlyweight(){
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();;
        fly5.operation();
        int objSize=factory.getFlyweightSize();
        System.out.println("objSize"+objSize);
    }
}
