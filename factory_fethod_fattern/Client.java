/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/2
 * @TIME: 22:52
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 02
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory=new UnderGraduateFactory();
        LeiFeng student=factory.CreateLeiFeng();
        student.BuyRice();
        student.sweep();
        student.Wash();
    }
}
