/**
 * @NAME: Proxy
 * @USER: DaHuangGO
 * @DATE: 2022/9/1
 * @TIME: 0:41
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 01
 */
public class Proxy extends Subject{

    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject==null){
            realSubject=new RealSubject();
        }
        System.out.println("我在干坏事！！！！");
        System.out.println("下面是我代理的内容");
        realSubject.request();
    }
}
