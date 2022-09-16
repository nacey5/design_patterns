/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/17
 * @TIME: 0:20
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 17
 */
public class Client {
    public static void main(String[] args) {
        Originator o=new Originator();
        //初始状态
        o.setState("On");
        o.show();

        //管理者保存状态
        Caretaker c=new Caretaker();
        c.setMemento(o.createMemento());
        //状态被改变
        o.setState("Off");
        o.show();
        //回档
        o.setMemento(c.getMemento());
        o.show();

    }
}
