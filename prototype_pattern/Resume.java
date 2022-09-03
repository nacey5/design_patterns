/**
 * 简历
 * @NAME: Resume
 * @USER: DaHuangGO
 * @DATE: 2022/9/4
 * @TIME: 0:35
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 04
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        this.timeArea=timeArea;
        this.company=company;
    }

    public void display(){
        System.out.println(name+sex+age);
        System.out.println("work experience:"+timeArea+company);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume resume=null;
        try {
            resume= (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }
}
