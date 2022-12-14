/**
 * @NAME: FlyweightFactory
 * @USER: DaHuangGO
 * @DATE: 2022/12/14
 * @TIME: 16:18
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 14
 * 享元工厂
 */
public class FlyweightFactory {
    private Hashtable flyweights=new Hashtable();

    public FlyweightFactory() {
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return (Flyweight) flyweights.get(key);
    }

}
