/**
 * 抽象类:顶级逻辑架构
 * @NAME: AbstarctClass
 * @USER: DaHuangGO
 * @DATE: 2022/9/6
 * @TIME: 22:12
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 06
 */
abstract class AbstractClass {
    //抽象行为1
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println();
    }
}
