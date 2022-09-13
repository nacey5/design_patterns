/**
 * @NAME: ConcreteStateC
 * @USER: DaHuangGO
 * @DATE: 2022/9/13
 * @TIME: 19:47
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 13
 */
public class ConcreteStateC extends State {

    static {
        System.out.println("初始化状态C");
    }

    @Override
    public void handler(Context context) {
        context.setState(new EndState());
    }
}
