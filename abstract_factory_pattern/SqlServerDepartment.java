/**
 * @NAME: SqlServerDepartment
 * @USER: DaHuangGO
 * @DATE: 2022/9/12
 * @TIME: 22:32
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 12
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在sql中给Department表添加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在sql中根据id得到一条Department表中的一条记录");
        return null;
    }
}
