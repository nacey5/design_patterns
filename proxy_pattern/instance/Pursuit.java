/**
 * @NAME: Pursuit
 * @USER: DaHuangGO
 * @DATE: 2022/9/1
 * @TIME: 0:46
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 01
 */
public class Pursuit implements GiveGift{

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName()+"!送你洋娃娃");
    }

    @Override
    public void giveFlows() {
        System.out.println(mm.getName()+"!送你小花花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName()+"!送你巧克力");
    }
}
