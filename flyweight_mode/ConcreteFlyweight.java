/**
 * @NAME: ConcreteFlyweight
 * @USER: DaHuangGO
 * @DATE: 2022/12/14
 * @TIME: 16:07
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 14
 */
public class ConcreteFlyweight extends Flyweight{

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体的flyweight:"+extrinsicstate);
    }
}
