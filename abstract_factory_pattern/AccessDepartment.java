/**
 * @NAME: AccessDepartment
 * @USER: DaHuangGO
 * @DATE: 2022/9/12
 * @TIME: 22:34
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 12
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Access中根据id得到Department表的一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("根据id得到Department表的一条记录");
        return null;
    }
}
