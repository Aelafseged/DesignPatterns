package factory_method;

public class SummerShoeFactory extends ShoeFactory{
    @Override
    FootWear createFootWear() {
        return new SummerShoes(11, "Summer Hike", true);
    }
}
