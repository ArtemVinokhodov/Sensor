package observer;

public class Display implements SensorObserver {
    @Override
    public void update(int temperature, int weight, String color) {
        System.out.println("Temperature: " + temperature + "°C, Weight: " + weight + "g, Color: " + color);
    }
}
