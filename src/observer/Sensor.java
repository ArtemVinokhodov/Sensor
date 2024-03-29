package observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private int temperature;
    private int weight;
    private String color;
    private List<SensorObserver> observers = new ArrayList<>();

    public void addObserver(SensorObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SensorObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setWeight(int weight) {
        this.weight = weight;
        notifyObservers();
    }

    public void setColor(String color) {
        this.color = color;
        notifyObservers();
    }

    private void notifyObservers() {
        for (SensorObserver observer : observers) {
            observer.update(temperature, weight, color);
        }
    }
}
