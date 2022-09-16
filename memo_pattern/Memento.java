/**
 * 备忘录类
 * @NAME: Memento
 * @USER: DaHuangGO
 * @DATE: 2022/9/17
 * @TIME: 0:15
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 17
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
