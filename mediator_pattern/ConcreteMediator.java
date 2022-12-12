/**
 * @NAME: ConcreteMediator
 * @USER: DaHuangGO
 * @DATE: 2022/12/13
 * @TIME: 1:56
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 13
 * 中介者
 */
public class ConcreteMediator implements Mediator{
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;


    @Override
    public void send(String message, Colleague colleague) {
        if (colleague==concreteColleague1){
            concreteColleague2.notify(message);
        }else {
            concreteColleague1.notify(message);
        }
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }
}
