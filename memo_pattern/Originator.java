/**
 * 发起类
 * @NAME: Originator
 * @USER: DaHuangGO
 * @DATE: 2022/9/17
 * @TIME: 0:12
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 17
 */
public class Originator {
    //需要保存的属性,可能有多个
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备忘录实例，将需要保存的信息导入并存入一个Memento对象
    public Memento createMemento(){
        return new Memento(this.state);
    }

    //恢复备忘录 ,将Memento导入并将相关的数据恢复
    public void setMemento(Memento memento){
        this.state=memento.getState();
    }

    public void show(){
        System.out.println("State="+state);
    }
}
