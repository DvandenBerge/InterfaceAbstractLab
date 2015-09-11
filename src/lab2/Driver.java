package lab2;

/**
 * @author Dan
 */
public class Driver {
    public static void main(String[] args) {
        ICourse[] courses ={
            new IntroToProgrammingCourse("Intro to Programming","300-101"),
            new IntroJavaCourse("Intro to Java", "300-105"),
            new AdvancedJavaCourse("Advanced Java Designs", "300-201")
        };
        
        for(ICourse c: courses){
            System.out.println(c.getCourseName());
            System.out.println(c.getCourseNumber());
        }
    }
 
}
