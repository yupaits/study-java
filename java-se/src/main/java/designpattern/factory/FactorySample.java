package designpattern.factory;

/**
 * @author ts495
 * @date 2020/12/5
 */
public class FactorySample {

    public static void main(String[] args) {
        System.out.println(">>>>>> 工厂方法：");
        System.out.println(new IPhoneFactory().getPhone());
        System.out.println(new HuaweiP40Factory().getPhone());

        System.out.println(">>>>>> 抽象工厂：");
        AbstractFactory appleFactory = new AppleFactory();
        System.out.println(appleFactory.getPhone());
        System.out.println(appleFactory.getPad());
        AbstractFactory huaweiFactory = new HuaweiFactory();
        System.out.println(huaweiFactory.getPhone());
        System.out.println(huaweiFactory.getPad());
    }
}
