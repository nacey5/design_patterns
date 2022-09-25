import java.util.ArrayList;
import java.util.List;

/**
 * @NAME: Composite
 * @USER: DaHuangGO
 * @DATE: 2022/9/25
 * @TIME: 16:20
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 25
 */
public class Composite extends Component{
    //定义一个子对象集合用来存储下属的枝节点和叶节点
    private List<Component> children =new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println("-枝节点:"+depth+":"+name);
        for (Component component : children) {
            component.display(depth+2);
        }
    }
}
