package factory_method;

public class SummerShoes implements FootWear {
    private int price;
    private String type;
    private boolean onDuty;

    public SummerShoes(int price, String type, boolean onDuty) {
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
        System.out.println("Summer shoes on duty");
    }

    @Override
    public void offDuty() {
        onDuty = false;
        System.out.println("Summer shoes off duty");
    }

    @Override
    public String toString() {
        return "SummerShoes{" +
                "price=" + price +
                ", type='" + type + '\'' +
                ", onDuty=" + onDuty +
                '}';
    }
}
