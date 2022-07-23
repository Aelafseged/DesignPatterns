package abstact_factory_method;

public class Shop {

    public static AbstractClothFactory getFactory(String season) {
        if (season.equalsIgnoreCase("summer"))
            return new JamaicaClothFactory();
        else
            return new CanadaClothFactory();
    }

}
