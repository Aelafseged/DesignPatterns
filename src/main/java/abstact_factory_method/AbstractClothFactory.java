package abstact_factory_method;

import factory_method.FootWear;

public interface AbstractClothFactory {
    HeadWear createHeadWear();

    FootWear createFootWear();
}
