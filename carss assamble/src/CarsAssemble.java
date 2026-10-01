public class CarsAssemble {

    private static final int BASE_SPEED_PER_HOUR = 221;

    // 1. Calcula la tasa de éxito según la velocidad de la línea de ensamblaje
    public double successRate(int speed) {
        if (speed == 0) {
            return 0.0;
        } else if (speed >= 1 && speed <= 4) {
            return 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return 0.9;
        } else if (speed == 9) {
            return 0.8;
        } else {
            return 0.77; // Velocidad 10
        }
    }

    // 2. Calcula la producción total por hora multiplicando por la tasa de éxito
    public double productionRatePerHour(int speed) {
        return speed * BASE_SPEED_PER_HOUR * successRate(speed);
    }

    // 3. Calcula cuántos autos válidos (enteros) se producen por minuto
    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}