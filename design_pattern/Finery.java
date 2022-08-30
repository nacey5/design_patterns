/**
 * 服饰类
 * @NAME: Finery
 * @USER: DaHuangGO
 * @DATE: 2022/8/31
 * @TIME: 0:10
 * @YEAR: 2022
 * @MONTH: 08
 * @DAY: 31
 */
public class Finery extends Person {
    protected Person component;

    //打扮
    public void Decorate(Person component){
        this.component=component;
    }

    @Override
    public void show() {
        if (component!=null){
            component.show();
        }
    }
}
