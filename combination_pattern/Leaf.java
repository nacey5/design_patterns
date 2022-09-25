/**
 * @NAME: Leaf
 * @USER: DaHuangGO
 * @DATE: 2022/9/25
 * @TIME: 16:14
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 25
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    //叶子节点本身是没有分支的了，所以他的add和remove是没有意义的，实现它的
    //主要意义在于能够有完全一致的接口
    @Override
    public void add(Component c) {
        System.out.println("Cannot add a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println("-leaf:"+depth+":"+name);
    }
}
