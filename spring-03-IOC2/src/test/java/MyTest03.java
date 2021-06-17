import com.jie.pro.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("b3.xml");

        User  user = (User) context.getBean("user");

        user.show();
    }
}
