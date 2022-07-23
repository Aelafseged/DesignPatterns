package abstact_factory_method;

import factory_method.FootWear;
import factory_method.SummerShoes;

public class JamaicaClothFactory implements AbstractClothFactory {
    @Override
    public HeadWear createHeadWear() {
        return new SummerHat();
    }

    @Override
    public FootWear createFootWear() {
        return new SummerShoes(12, "Beach", true);
    }
}
