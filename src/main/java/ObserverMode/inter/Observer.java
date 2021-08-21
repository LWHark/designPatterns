package ObserverMode.inter;

/**
 * @Description: <观察者接口>
 * @author: lw
 * @create: 2021/8/9
 */
public interface Observer {

    /** 更新布告板数据*/
    void update(float temp, float humidity, float pressure);

}
