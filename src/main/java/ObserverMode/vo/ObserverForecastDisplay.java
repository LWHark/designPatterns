package ObserverMode.vo;

import ObserverMode.inter.Observer;
import ObserverMode.inter.Subject;

/**
 * @Description: <天气预报-布告板>
 * @author: lw
 * @create: 2021/8/9
 */
public class ObserverForecastDisplay implements Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ObserverForecastDisplay(Subject subject){
        weatherData = subject;
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
    }

}
