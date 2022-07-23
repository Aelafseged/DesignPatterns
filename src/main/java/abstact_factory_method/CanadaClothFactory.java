package abstact_factory_method;

import factory_method.FootWear;
import factory_method.SummerShoes;
import factory_method.WinterShoes;

public class CanadaClothFactory implements AbstractClothFactory {
    @Override
    public HeadWear createHeadWear() {
        return new WinterHat();
    }

    @Override
    public FootWear createFootWear() {
        return new WinterShoes(12, "SnowBoarding", true);
    }
}
