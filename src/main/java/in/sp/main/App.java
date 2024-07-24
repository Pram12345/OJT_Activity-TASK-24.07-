package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String context_location = "/in/sp/resources/applicationContext.xml";
    	ApplicationContext context = new ClassPathXmlApplicationContext(context_location);
    	
    	Student std = context.getBean(Student.class);
    	std.display();
    	
    }
}
