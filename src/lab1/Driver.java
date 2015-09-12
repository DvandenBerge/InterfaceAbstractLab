package lab1;

/**
 * @author Dan
 */
public class Driver {
    public static void main(String[] args) {
        
        IntroToProgrammingCourse course1 = new IntroToProgrammingCourse("Intro to Programming","300-101");
        IntroJavaCourse course2 = new IntroJavaCourse("Intro to Java","300-105");
        AdvancedJavaCourse course3 = new AdvancedJavaCourse("Advanced Java Designs","300-201");
        
        course2.setPrerequisites("Intro to Programming");
        course3.setPrerequisites("Intro to Java");
        
        ITCourse[] schedule = {
            course1,course2,course3
        };
        
        for(ITCourse x:schedule){
            x.setCredits(2.0);
            System.out.println(x.getCourseName());
            System.out.println(x.getCourseNumber());
            System.out.println(x.getCredits());
        }
    }
}
