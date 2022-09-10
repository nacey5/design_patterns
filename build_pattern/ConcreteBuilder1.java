/**
 * @NAME: ConcretrBuilder1
 * @USER: DaHuangGO
 * @DATE: 2022/9/10
 * @TIME: 20:17
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 10
 */
public class ConcreteBuilder1 implements Builder {

    private Product product=new Product();
    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
