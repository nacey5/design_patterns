/**
 * @NAME: Proxy
 * @USER: DaHuangGO
 * @DATE: 2022/9/1
 * @TIME: 0:50
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 01
 */
public class Proxy implements GiveGift{

    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg=new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlows() {
        gg.giveFlows();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
