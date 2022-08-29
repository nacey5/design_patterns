/**
 * 返利收费子类
 * @author DAHUANG
 * @date 2022/8/30
 */
public class CashReturn implements CashSuper{

    private double moneyCondition=0.0d;
    private double moneyReturn=0.0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result=money;
        if (money>=moneyCondition){
            result=money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
