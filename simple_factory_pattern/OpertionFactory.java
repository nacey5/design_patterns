/**
 * @author DAHUANG
 * @date 2022/8/29
 */

public class OpertionFactory{
  
  public static Operation createOperate(String operate){
    Operation oper=null;
    switch(operate){
     case "+":
      oper=new OperationAdd();
      break;
    case "-":
      oper=new OperationSub();
      break;
    case "*":
      oper=new OperationMul();
      break;
    case "/":
      oper=new OperationDiv();
      break;  
}
  }

}



