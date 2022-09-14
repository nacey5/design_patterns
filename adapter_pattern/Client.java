/**
 * 客户端
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/15
 * @TIME: 0:05
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 15
 */
public class Client {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.request();
    }
}
