/**
 * @NAME: ConcreteStateB
 * @USER: DaHuangGO
 * @DATE: 2022/9/13
 * @TIME: 19:43
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 13
 */
public class ConcreteStateB extends State{

    static {
        System.out.println("初始化状态B");
    }

    @Override
    public void handler(Context context) {
        context.setState(new ConcreteStateC());
    }
}
