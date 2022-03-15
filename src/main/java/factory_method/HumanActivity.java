package factory_method;

public class HumanActivity {
    private ShoeFactory shoeFactory;

    public HumanActivity(ShoeFactory shoeFactory) {
        this.shoeFactory = shoeFactory;
    }

    public static void main(String[] args) {
        //create specific shoeFactory inside the human Activity
        HumanActivity humanActivity = new HumanActivity(new SummerShoeFactory());
        //using the specific shoeFactory allows us not to pass value
        //that is used for if clause which makes it extendable
        // add new extending factory class to create a new Footwear object
        FootWear realShoes = humanActivity.shoeFactory.createFootWear();
        //create Human object
        Human human = new Human(21, "Ali");
        // pass the needed object as parameter
        // Human and FootWear object can be developed independently with less concern of breaking the codebase
        // here we have clear  class hierarchy of factory classes that creates their own
        // specific objects
        human.goForRun(realShoes);
        human.goHome(realShoes);
    }
}
