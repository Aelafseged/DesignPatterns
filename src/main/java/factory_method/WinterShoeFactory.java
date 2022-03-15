package factory_method;

public class WinterShoeFactory extends ShoeFactory{
    @Override
    FootWear createFootWear() {
        return new WinterShoes(12, "Winter Hike", true);
    }
}
