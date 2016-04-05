import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by Ritesh on 4/5/2016.
 */
public class MainApp {
    public static void main(String[] arr){
        ApplicationContext context = new AnnotationConfigApplicationContext(Person.class, Phone.class);
        Person p = (Person) context.getBean(Person.class);
        p.setFirstName("RS");
        System.out.println("First name:"+p.getFirstName());

        ((AbstractApplicationContext) context).close();
    }

}
