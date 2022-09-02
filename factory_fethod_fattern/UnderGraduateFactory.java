/**
 * 大学生工厂
 * @NAME: UnderGraduateFactory
 * @USER: DaHuangGO
 * @DATE: 2022/9/2
 * @TIME: 22:48
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 02
 */
public class UnderGraduateFactory implements IFactory {
    @Override
    public LeiFeng CreateLeiFeng() {
        return new UnderGraduate();
    }
}
