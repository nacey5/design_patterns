/**
 * 声明一个接口声明，用户访问和管理Component子对象
 * @NAME: Component
 * @USER: DaHuangGO
 * @DATE: 2022/9/25
 * @TIME: 16:11
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 25
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
