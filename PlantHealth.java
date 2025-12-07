public class PlantHealth {

    public String analyze(double moisture, double temperature, double humidity) {

        // Temperature logic
        if (temperature < 20) {
            return "Condition: Cold Stress\nAdvice: Move the plant to a warmer place.";
        } else if (temperature > 35) {
            return "Condition: Heat Stress\nAdvice: Provide shade and water immediately.";
        }

        // Moisture logic
        if (moisureCalculator(moisture).equals("LOW")) {
            return "Condition: Dry Soil\nAdvice: Water the plant now.";
        } else if (moisureCalculator(moisture).equals("HIGH")) {
            return "Condition: Overwatered\nAdvice: Stop watering for 2–3 days.";
        }

        // Humidity logic
        if (humidity < 40) {
            return "Condition: Low Humidity\nAdvice: Spray water around the plant.";
        } else if (humidity > 85) {
            return "Condition: High Humidity\nAdvice: Increase ventilation.";
        }

        return "Condition: Healthy\nAdvice: Conditions are ideal. Keep monitoring regularly.";
    }

    private String moisureCalculator(double moisture) {
        if (moisture < 30) return "LOW";
        if (moisture > 80) return "HIGH";
        return "NORMAL";
    }
}
