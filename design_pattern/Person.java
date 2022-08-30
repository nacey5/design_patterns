/**
 * 某个人
 * @NAME: Person
 * @USER: DaHuangGO
 * @DATE: 2022/8/31
 * @TIME: 0:08
 * @YEAR: 2022
 * @MONTH: 08
 * @DAY: 31
 */
public class Person {
    public Person() {
    }
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的"+getName());
    }
}
