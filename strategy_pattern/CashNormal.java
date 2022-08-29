/**
 * 正常收费子类
 * @author DAHUANG
 * @date 2022/8/30
 */
public class CashNormal implements CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
