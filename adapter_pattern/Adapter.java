/**
 * 适配器
 * @NAME: Adapter
 * @USER: DaHuangGO
 * @DATE: 2022/9/14
 * @TIME: 23:47
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 14
 */
public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.SpecificRequest();
    }
}
