/**
 * ConcreteAggregate具体据积类
 * @NAME: ConcreteAggregate
 * @USER: DaHuangGO
 * @DATE: 2022/9/28
 * @TIME: 20:17
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 28
 */
public class ConcreteAggregate extends Aggregate{
    private List<Object> items=new ArrayList<>(10);
    @Override
    public Iterator createIterator() {
        return null;
    }

    public int count(){
        return items.size();
    }

    public Object getItem(int index){
        return items.get(index);
    }

    public void setItem(int index,Object value){
        items.add(index,value);
    }
}
