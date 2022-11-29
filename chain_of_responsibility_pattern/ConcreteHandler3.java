/**
 * @NAME: ConcreteHandler3
 * @USER: DaHuangGO
 * @DATE: 2022/11/29
 * @TIME: 14:35
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 29
 */
public class ConcreteHandler3 extends Handler{
    @Override
    public void handlerRequest(int request) {
        if (request >= 20 && request < 30){
            System.out.println(this.getType()+"处理请求："+request);
        }else if (successor!=null){
            successor.handlerRequest(request);
        }
    }

    @Override
    public String getType() {
        return "c3";
    }
}
