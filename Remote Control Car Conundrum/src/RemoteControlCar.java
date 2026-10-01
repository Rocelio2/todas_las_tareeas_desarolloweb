// Interface
interface RemoteControlCar {
    void drive();
    int getDistanceTraveled();
}

// Production Car
class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTraveled = 0;
    private int numberOfVictories = 0;

    public void drive() {
        distanceTraveled += 10;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    }
}

// Experimental Car
class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTraveled = 0;

    public void drive() {
        distanceTraveled += 20;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}

// TestTrack
class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static java.util.List<ProductionRemoteControlCar> getRankedCars(java.util.List<ProductionRemoteControlCar> cars) {
        java.util.Collections.sort(cars);
        return cars;
    }
}