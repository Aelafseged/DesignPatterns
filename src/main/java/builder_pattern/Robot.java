package builder_pattern;

public class Robot {
    int height;
    int weight;
    int batteryCapacity;

    private Robot(int height, int weight, int batteryCapacity) {
        this.height = height;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "height=" + height +
                ", weight=" + weight +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }

    static class RobotBuilder {
        //copying the parent class fields
        private int height;
        private int weight;
        private int batteryCapacity;

        // set the fields and builder methods returns the builder instance
        //as to create a chain of calls
        public RobotBuilder withHeight(int height) {
            this.height = height;
            return this;
        }

        public RobotBuilder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public RobotBuilder withBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Robot build() {
            return new Robot(height, weight, batteryCapacity);
        }

    }
}

class RobotTester {

    public static void main(String[] args) {
        //first create the builder object
        Robot.RobotBuilder robotBuilder = new Robot.RobotBuilder();
        Robot builtRobot = robotBuilder.withBatteryCapacity(12).withWeight(30).build();
        System.out.println(builtRobot);

    }

}