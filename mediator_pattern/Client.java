/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/12/13
 * @TIME: 2:01
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 13
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator m=new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);
        m.setConcreteColleague1(c1);
        m.setConcreteColleague2(c2);
        c1.send("你吃饭了？？？");
        c2.send("等你请客呢！！");
    }
}
