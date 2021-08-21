package ObserverMode.vo;

import ObserverMode.inter.Observer;
import ObserverMode.inter.Subject;

/**
 * @Description: <气象统计-布告板>
 * @author: lw
 * @create: 2021/8/9
 */
public class ObserverStatisticsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ObserverStatisticsDisplay(Subject subject){
        this.weatherData = subject;
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
