package factory_method;

public class ShoeFactory {
    FootWear createFootWear(String shoeType){
        if(shoeType.contains("Summer")){
            return new SummerShoes(12,"Summer Hike",true);
        }
        else
            return new WinterShoes(22,"Winter hike", true);
    }
}
