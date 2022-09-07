/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/6
 * @TIME: 22:30
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 06
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass c;
        c=new ConcreteClassA();
        c.templateMethod();

        c=new ConcreteClassB();
        c.templateMethod();
    }
}
