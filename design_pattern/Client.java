/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/8/31
 * @TIME: 0:15
 * @YEAR: 2022
 * @MONTH: 08
 * @DAY: 31
 */
public class Client {
    public static void main(String[] args) {
        Person mainPer=new Person("DaHuangGO");
        BigTrouser bigTrouser=new BigTrouser();
        Pants pants=new Pants();
        TShirt tShirt=new TShirt();
        bigTrouser.Decorate(mainPer);
        pants.Decorate(bigTrouser);
        tShirt.Decorate(pants);
        tShirt.show();
    }
}
