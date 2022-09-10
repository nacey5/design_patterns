/**
 * @NAME: Product
 * @USER: DaHuangGO
 * @DATE: 2022/9/10
 * @TIME: 20:13
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 10
 */
public class Product {
    List<String> parts=new ArrayList<>();

    /**
     * 添加产品部件
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        parts.forEach(System.out::println);
    }


}
