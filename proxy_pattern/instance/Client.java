/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/1
 * @TIME: 0:48
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 01
 */
public class Client {
    public static void main(String[] args) {
        SchoolGirl marry=new SchoolGirl("Marry-Jin");

        Proxy xiaosan=new Proxy(marry);

        xiaosan.giveChocolate();
        xiaosan.giveDolls();
        xiaosan.giveDolls();
    }
}
