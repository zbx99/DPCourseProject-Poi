package goods.stock;

import java.util.Hashtable;

/**
 * @author 田括铜
 * @version  1.0
 * 实现工厂方法类，用哈希表来储存对象，有对象就返回，没有就新建
 */
public class FlyweightFactory {
    private Hashtable<Object, Flyweight> flyweights=new Hashtable<Object, Flyweight>();
    public FlyweightFactory(){}

    /**
     * @param obj 传入想要打印的物体名称
     * @return  返回想要打印的物体
     */
    public Flyweight getFlyWeight(Object obj){
        Flyweight flyweight=(Flyweight)flyweights.get(obj);
        if(flyweight==null){
            if(((String)obj).equals("000001")) {
                flyweight=new ChocolaeBreadFlyweight((String)obj);
                flyweights.put(obj,flyweight);
            }
            else if(((String)obj).equals("000002")){
                flyweight = new JavaCoffeeFlyweight((String) obj);
                flyweights.put(obj, flyweight);
            }
            else if(((String)obj).equals("000003")){
                flyweight=new DumbbellFlyweight((String)obj);
                flyweights.put(obj,flyweight);
            }
            else if(((String)obj).equals("000004")){
                flyweight=new QuickNoodleFlyweight((String)obj);
                flyweights.put(obj,flyweight);
            }
            else if(((String)obj).equals("000005")){
                flyweight=new QiaoLeZiFlyweight((String)obj);
                flyweights.put(obj,flyweight);
            }
        }
        return  flyweight;
    }
    public  int getFlyweightSize(){
        return  flyweights.size();
    }
}
