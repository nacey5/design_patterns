/**
 * @NAME: UnsharedConcreteFlyweight
 * @USER: DaHuangGO
 * @DATE: 2022/12/14
 * @TIME: 16:08
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 14
 * 不需要共享的子类
 */
public class UnsharedConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight");
    }
}
