/**
 * @NAME: EndState
 * @USER: DaHuangGO
 * @DATE: 2022/9/13
 * @TIME: 20:09
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 13
 */
public class EndState extends State {
    static {
        System.out.println("顶级状态,状态终止");
    }
    @Override
    public void handler(Context context) {
        return;
    }
}
