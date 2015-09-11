package lab2;

/**
 * @author Dan
 */
public interface ICourse {
    public abstract String getCourseName();
    public abstract String getCourseNumber();
    public abstract double getCredits();
    
    public abstract void setCourseName(String courseName);
    public abstract void setCourseNumber(String courseNumber);
    public abstract void setCredits(double credits);
    
}
