/**
 * 打折收费子类
 * @author DAHUANG
 * @date 2022/8/30
 */
public class CashRebate implements CashSuper{

    private double moneyRebate=1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
