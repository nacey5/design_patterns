/**
 * 志愿者工厂
 * @NAME: VolunteerFactory
 * @USER: DaHuangGO
 * @DATE: 2022/9/2
 * @TIME: 22:51
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 02
 */
public class VolunteerFactory implements IFactory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
