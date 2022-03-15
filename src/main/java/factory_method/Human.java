package factory_method;

class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void goForRun(FootWear footWear) {
        footWear.onDuty();
    }

    public void goHome(FootWear footWear) {
        footWear.offDuty();
    }
}
