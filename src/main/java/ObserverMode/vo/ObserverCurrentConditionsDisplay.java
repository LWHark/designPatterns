package ObserverMode.vo;

import ObserverMode.inter.Observer;
import ObserverMode.inter.Subject;

/**
 * @Description: <目前状况-布告板>
 * @author: lw
 * @create: 2021/8/9
 */
public class ObserverCurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ObserverCurrentConditionsDisplay(Subject subject){
        weatherData = subject;
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
    }

}
