/**
 * @NAME: ConcreteBuilder2
 * @USER: DaHuangGO
 * @DATE: 2022/9/10
 * @TIME: 20:18
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 10
 */
public class ConcreteBuilder2 implements Builder{
    private Product product=new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
