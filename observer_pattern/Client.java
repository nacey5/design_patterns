/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/11
 * @TIME: 22:46
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 11
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject s=new ConcreteSubject();
        s.attach(new ConcreteObserver("X",s));
        s.attach(new ConcreteObserver("Y",s));
        s.attach(new ConcreteObserver("Z",s));
        s.setSubjectState("ABC");
        s.notifyAllOb();
    }
}
