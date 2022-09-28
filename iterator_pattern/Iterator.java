/**
 * Iterator迭代器抽象类
 * @NAME: Iterator
 * @USER: DaHuangGO
 * @DATE: 2022/9/28
 * @TIME: 20:13
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 28
 */
public abstract class Iterator {
    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
