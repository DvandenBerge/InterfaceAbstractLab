package lab2;

/**
 * @author Dan
 */
public class Driver {
    public static void main(String[] args) {
        IntroToProgrammingCourse course1 = new IntroToProgrammingCourse("Intro to Programming","300-101");
        IntroJavaCourse course2 = new IntroJavaCourse("Intro to Java", "300-105");
        AdvancedJavaCourse course3 = new AdvancedJavaCourse("Advanced Java Designs", "300-201");
        
        course2.setPrerequisites("Intro to Programming");
        course3.setPrerequisites("Intro to Java");
        
        ICourse[] courses ={
            course1,course2,course3
        };
        
        courses[0].setCredits(2.0);
        courses[1].setCredits(3.0);
        courses[2].setCredits(4.0);
        
        for(ICourse c: courses){
            System.out.println(c.getCourseName());
            System.out.println(c.getCourseNumber());
            System.out.println(c.getCredits());
        }
        
        System.out.println(course2.getPrerequisites());
        System.out.println(course3.getPrerequisites());
    }
 
}
