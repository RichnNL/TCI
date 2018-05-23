import java.util.Date;

public class Course {

    private String name;
    private Date beginDate;


    public  Course()
    {}

    public  Course(String n, Date begDate)
    {
        this.name=n;
        this.beginDate=begDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }
}
