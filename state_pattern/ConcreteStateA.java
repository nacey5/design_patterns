/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/13
 * @TIME: 19:47
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 13
 */
public class Client {
    public static void main(String[] args) {
        //设置初始状态
        Context context=new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
