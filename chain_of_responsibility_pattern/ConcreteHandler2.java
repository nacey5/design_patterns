/**
 * @NAME: ConcreteHandler2
 * @USER: DaHuangGO
 * @DATE: 2022/11/29
 * @TIME: 14:34
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 29
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void handlerRequest(int request) {
        if (request >= 10 && request < 20){
            System.out.println(this.getType()+"处理请求："+request);
        }else if (successor!=null){
            successor.handlerRequest(request);
        }
    }

    @Override
    public String getType() {
        return "c2";
    }
}
