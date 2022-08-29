/**
 * @author DAHUANG
 * @date 2022/8/30
 */
public class Client {
    public static void main(String[] args) {
        double total=0.0d;
        System.out.println("请输入您想要的方式:");
        System.out.println("正常收费 or 满300返100 or 打八折");
        Scanner scanner=new Scanner(System.in);
        CashContext context=new CashContext(scanner.nextLine());
        System.out.println("请输入单价:");
        String textPrice = scanner.nextLine();
        System.out.println("请输入数量:");
        String textNum = scanner.nextLine();
        double totalPrices=0d;
        totalPrices=context.getResult(Double.parseDouble(textPrice)*Double.parseDouble(textNum));
        total=total+totalPrices;
        System.out.println("单价："+textPrice+" 数量："+textNum+" 合计:"+totalPrices);
        System.out.println("优惠后的价格为："+total);
    }
}
