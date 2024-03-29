import observer.Display;
import observer.Sensor;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        Display display = new Display();
        sensor.addObserver(display);

        // При температуре 0 градусов
        sensor.setTemperature(0);
        sensor.setWeight(1);
        sensor.setColor("White");

        // При повышении температуры
        for (int i = 1; i <= 5; i++) {
            sensor.setTemperature(i);
            sensor.setWeight(1 + (i * 2)); // Вес меняется на 2 г за каждый градус
            sensor.setColor("Black");
        }
    }
}
