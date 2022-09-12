/**
 * @NAME: SqlServerUser
 * @USER: DaHuangGO
 * @DATE: 2022/9/12
 * @TIME: 22:30
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 12
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在sql server中添加一条数据");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在sql server中根据id得到一条表记录");
        return null;
    }
}
