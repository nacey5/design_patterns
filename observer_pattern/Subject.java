/**
 * 抽象通知者
 * @NAME: Subject
 * @USER: DaHuangGO
 * @DATE: 2022/9/11
 * @TIME: 22:23
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 11
 */
public abstract class Subject {
    private List<Observer> observers=new ArrayList<>();

    //增加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }
    //移除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllOb(){
        observers.forEach(Observer::update);
    }
}
