package bridge_design_pattern;

public class BridgeDesignPattern {

    public static void main(String[] args) {
        Race hispanicRace = new HispanicRace();
        HumanNew child = new Child(hispanicRace);
        child.run();
    }

}

class HumanNew {
    private Race race;

    public HumanNew(Race race) {
        this.race = race;
    }

    public Race getRace() {
        return race;
    }

    void run() {
        System.out.println("Human running");
    }
}

interface Race {
}

class HispanicRace implements Race {
    @Override
    public String toString() {
        return "Hispanic";
    }
}

class HabeshaRace implements Race {
    @Override
    public String toString() {
        return "Habesha";
    }
}

class KoreanRace implements Race {
    @Override
    public String toString() {
        return "Korean";
    }
}

class Child extends HumanNew {

    public Child(Race race) {
        super(race);
    }

    @Override
    void run() {
        System.out.println(super.getRace() + " child running");
    }
}

class Adult extends HumanNew {

    public Adult(Race race) {
        super(race);
    }
}
