/**
 * @NAME: WorkExperience
 * @USER: DaHuangGO
 * @DATE: 2022/9/4
 * @TIME: 0:37
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 04
 */
public class WorkExperience implements Cloneable{
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        WorkExperience workExperience=null;
        try {
            workExperience= (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return this;
    }
}
