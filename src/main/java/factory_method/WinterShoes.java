package factory_method;

public class WinterShoes implements FootWear {
    private int price;
    private String type;
    private boolean onDuty;

    public WinterShoes(int price, String type, boolean onDuty) {
        this.price = price;
        this.type = type;
        this.onDuty = onDuty;
    }
    @Override
    public boolean isOnDuty() {
        return onDuty;
    }

    @Override
    public void onDuty() {
        onDuty = true;
        System.out.println("Winter shoes on duty");
    }

    @Override
    public void offDuty() {
        onDuty = false;
        System.out.println("Winter shoes off duty");
    }

    @Override
    public String toString() {
        return "WinterShoes{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", onDuty=" + onDuty +
                '}';
    }
}
