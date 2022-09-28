/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/28
 * @TIME: 20:24
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 28
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate=new ConcreteAggregate();
        aggregate.setItem(0,"A");
        aggregate.setItem(1,"B");
        aggregate.setItem(2,"C");
        aggregate.setItem(3,"D");
        aggregate.setItem(4,"E");
        Iterator concreteIterator = new ConcreteIterator(aggregate);
        Object item=concreteIterator.first();
        while (!concreteIterator.isDone()){
            System.out.println(concreteIterator.currentItem()+"请购买车票");
            concreteIterator.next();
        }
    }
}
