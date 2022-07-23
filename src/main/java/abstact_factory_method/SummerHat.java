package abstact_factory_method;

public class SummerHat implements HeadWear {

    @Override
    public void putOn() {
        System.out.println("putting on Summer Hat");
    }

    @Override
    public void takeOff() {
        System.out.println("taking off Summer hat");
    }
}
