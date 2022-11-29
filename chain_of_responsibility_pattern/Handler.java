/**
 * @NAME: Handler
 * @USER: DaHuangGO
 * @DATE: 2022/11/29
 * @TIME: 14:29
 * @YEAR: 2022
 * @MONTH: 11
 * @DAY: 29
 * 处理请示的接口
 */
public abstract class Handler {
    protected Handler successor;

    //设置继任者
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    //处理请求的抽象方法
    public abstract void handlerRequest(int request);

    String type;

    public String getType() {
        return type;
    }
}
