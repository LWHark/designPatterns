package ObserverMode.inter;

/**
 * @Description: <主题接口>
 * @author: lw
 * @create: 2021/8/9
 */
public interface Subject {

    /** 登记观察者*/
    void registerObserver(Observer observer);

    /** 移除观察者*/
    void removeObserver(Observer observer);

    /** 通知所有观察者*/
    void notifyObservers();

}
