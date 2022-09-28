/**
 * ConcreteIterator 具体迭代器类
 * @NAME: ConcreteIterator
 * @USER: DaHuangGO
 * @DATE: 2022/9/28
 * @TIME: 20:16
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 28
 */
public class ConcreteIterator extends Iterator{
    //定义一个具体聚集对象
    private ConcreteAggregate aggregate;
    private int current=0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return this.aggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object ret=null;
        current++;
        if (current<aggregate.count()){
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count();
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
