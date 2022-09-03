/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/4
 * @TIME: 1:06
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 04
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a=new Resume("大鸟");
        a.setPersonalInfo("男",29+"");
        a.setWorkExperience("1998-2000","xx公司");

        Resume b= (Resume) a.clone();
        b.setWorkExperience("1998-2006","YY企业");

        Resume c= (Resume) a.clone();
        c.setPersonalInfo("男","24");

        a.display();
        b.display();
        c.display();
    }
}
