/**
 * 具体通知者
 * @NAME: ConcreteSubject
 * @USER: DaHuangGO
 * @DATE: 2022/9/11
 * @TIME: 22:36
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 11
 */
public class ConcreteSubject extends Subject{
    //具体被观察者的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
