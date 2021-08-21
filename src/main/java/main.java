import ObserverMode.inter.Observer;
import ObserverMode.vo.ObserverCurrentConditionsDisplay;
import ObserverMode.inter.Subject;
import ObserverMode.vo.SubjectWeatherData;

public class main {

    public static void main(String[] args) {
        // 创建主题
        Subject subject = new SubjectWeatherData();

        // 添加观察者
        Observer currentConditionsDisplay = new ObserverCurrentConditionsDisplay(subject);
        Observer forecastDisplay = new ObserverCurrentConditionsDisplay(subject);
        Observer statisticsDisplay = new ObserverCurrentConditionsDisplay(subject);

        subject.notifyObservers();
    }

}
