/**
 * @NAME: ConcreteColleague1
 * @USER: DaHuangGO
 * @DATE: 2022/12/13
 * @TIME: 1:59
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 13
 * 具体类1
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事二得到信息:"+message);
    }
}
