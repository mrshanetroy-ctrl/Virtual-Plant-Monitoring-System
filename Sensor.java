import java.util.Random;

public class Sensor {

    Random random = new Random();

    public double readMoisture() {
        return 20 + (90 - 20) * random.nextDouble();
    }

    public double readTemperature() {
        return 18 + (40 - 18) * random.nextDouble();
    }

    public double readHumidity() {
        return 30 + (90 - 30) * random.nextDouble();
    }
}
