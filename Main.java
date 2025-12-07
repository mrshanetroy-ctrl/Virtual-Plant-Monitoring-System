public class Main {

    public static void main(String[] args) {

        System.out.println("\n===== VIRTUAL PLANT MONITOR (JAVA VERSION) =====\n");

        Sensor sensor = new Sensor();
        Camera camera = new Camera();
        PlantHealth health = new PlantHealth();

        // Read sensor values
        double moisture = sensor.readMoisture();
        double temperature = sensor.readTemperature();
        double humidity = sensor.readHumidity();

        System.out.println("Soil Moisture    : " + moisture + "%");
        System.out.println("Temperature      : " + temperature + "°C");
        System.out.println("Humidity         : " + humidity + "%");

        // Capture image (simulated)
        String imagePath = camera.captureImage();
        System.out.println("Image Captured   : " + imagePath);

        // Analyze health
        String condition = health.analyze(moisture, temperature, humidity);

        System.out.println("\n--- HEALTH STATUS ---");
        System.out.println(condition);

        System.out.println("\n===== MONITORING COMPLETE =====\n");
    }
}
