package abstact_factory_method;

public class WinterHat implements HeadWear {

    @Override
    public void putOn() {
        System.out.println("putting on Winter Hat");
    }

    @Override
    public void takeOff() {
        System.out.println("taking off Winter hat");
    }
}
