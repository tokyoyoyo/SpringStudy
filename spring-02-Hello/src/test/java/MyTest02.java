import com.jun.spr.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("b2.xml");

        Hello hello = (Hello) context.getBean("hello");

        System.out.println(hello.toString());
    }
}
