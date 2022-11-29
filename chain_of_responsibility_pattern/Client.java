/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/11/29
 * @TIME: 14:35
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 29
 */
public class Client {
    public static void main(String[] args) {
        Handler h1=new ConcreteHandler1();
        Handler h2=new ConcreteHandler2();
        Handler h3=new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        int[] requests=new int[]{2,5,14,22,18,3,27,20};
        for (int request : requests) {
            h1.handlerRequest(request);
        }
    }
}
