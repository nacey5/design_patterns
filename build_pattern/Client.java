/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/10
 * @TIME: 20:21
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 10
 */
public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        Builder b1=new ConcreteBuilder1();
        Builder b2=new ConcreteBuilder2();
        director.startConstruct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.startConstruct(b2);
        Product p2=b2.getResult();
        p2.show();
    }
}
