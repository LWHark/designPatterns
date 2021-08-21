package ObserverMode.vo;

import ObserverMode.inter.Observer;
import ObserverMode.inter.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: <气象站>
 * @author: lw
 * @create: 2021/8/9
 */
public class SubjectWeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public SubjectWeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(observer);
        }
    }

    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

}
