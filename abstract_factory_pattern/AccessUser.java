/**
 * @NAME: AccessUser
 * @USER: DaHuangGO
 * @DATE: 2022/9/12
 * @TIME: 22:31
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 12
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中给User表中添加一条数据");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据ID得到User表中的一个数据");
        return null;
    }
}
