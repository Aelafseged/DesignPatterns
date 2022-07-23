package abstact_factory_method;

import factory_method.FootWear;

public class Client {
    public static void main(String[] args) {
        //shop object give access to the clothFactoy
        AbstractClothFactory factory = Shop.getFactory("summer");
        FootWear footWear = factory.createFootWear();
        HeadWear headWear = factory.createHeadWear();
        headWear.putOn();
        System.out.println(footWear.isOnDuty());
    }
}
