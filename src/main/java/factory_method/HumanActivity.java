package factory_method;

public class HumanActivity {
    private ShoeFactory shoeFactory;

    public HumanActivity(ShoeFactory shoeFactory) {
        this.shoeFactory = shoeFactory;
    }

    public static void main(String[] args) {
        //create shoeFactory inside the HumanActivity
        HumanActivity humanActivity = new HumanActivity(new ShoeFactory());
        //use the factory to create the needed shoe
        FootWear realShoes = humanActivity.shoeFactory.createFootWear("Summer");
        //create Human object
        Human human = new Human(21, "Ali");
        // pass the needed object as parameter
        // Human and FootWear object can be developed independently with less concern of breaking the codebase
        human.goForRun(realShoes);
        human.goHome(realShoes);
    }
}
