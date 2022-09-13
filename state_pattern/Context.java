/**
 * @NAME: Context
 * @USER: DaHuangGO
 * @DATE: 2022/9/13
 * @TIME: 19:40
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 13
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.handler(this);
    }
}
