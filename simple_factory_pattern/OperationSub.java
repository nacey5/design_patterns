/**
 * @author DAHUANG
 * @date 2022/8/29
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result=0;
        result=get_numberA()-get_numberB();
        return result;
    }
}
