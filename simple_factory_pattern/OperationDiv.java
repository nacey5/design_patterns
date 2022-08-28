/**
 * @author DAHUANG
 * @date 2022/8/29
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result=0;
        if (get_numberB()==0){
            throw new RuntimeException("除数不能为0");
        }
        result=get_numberA()/get_numberB();
        return result;
    }
}
