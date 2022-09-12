/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/12
 * @TIME: 22:35
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 12
 */
public class Client {
    public static void main(String[] args) {
        User user=new User();
        Department dept=new Department();
        IUser iUser=DataAccess.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment id=DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }
}
