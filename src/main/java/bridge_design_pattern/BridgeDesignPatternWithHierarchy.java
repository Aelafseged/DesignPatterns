package bridge_design_pattern;

public class BridgeDesignPatternWithHierarchy {
}

abstract class Human {
    abstract void run();
}

class HispanicHuman extends Human {
    @Override
    void run() {
        System.out.println("Correr o amigo");
    }
}

class HabeshaHuman extends Human {
    @Override
    void run() {
        System.out.println("Abebe Bekila run");
    }
}

class KoreanHuman extends Human {
    @Override
    void run() {
        System.out.println("korean run");
    }
}
//what if we have different kinds of humans?
// we will have HisapanicChild, HispanicAdult, HabeshaChild, HabeshaAdult