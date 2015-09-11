package lab1;

/**
 * @author Dan
 */
public class Driver {
    public static void main(String[] args) {
        ITCourse[] schedule = {
            new IntroToProgrammingCourse("Intro to Programming","300-101"),
            new IntroJavaCourse("Intro to Java","300-105"),
            new AdvancedJavaCourse("Advanced Java Designs","300-201")
        };
        
        for(ITCourse x:schedule){
            System.out.println(x.getCourseName());
            System.out.println(x.getCourseNumber());
        }
    }
}
