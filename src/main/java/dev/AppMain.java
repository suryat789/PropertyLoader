package dev;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        AppPropertiesBO appProperties = context.getBean(AppPropertiesBO.class);
         
        /*AppProperties person = new Person();
        person.setName("Pankaj"); person.setCountry("India");
         
        personDAO.save(person);
         
        System.out.println("Person::"+person);*/
         
        List<AppProperties> list = appProperties.getAppProperties("Points",	"SomeFile1");
         
        for(AppProperties p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();   
	}
}
