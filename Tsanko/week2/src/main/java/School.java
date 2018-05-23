import java.util.ArrayList;
import java.util.Date;

public class School {

   private String name;
   private Date openingDate;
   private ArrayList<Course> courses;


   public School()
   {

   }
    public School(String n, Date opDate)
    {
        this.name=n;
        this.openingDate=opDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public void addCourse(Course crs)
    {
        courses.add(crs);
    }
}
