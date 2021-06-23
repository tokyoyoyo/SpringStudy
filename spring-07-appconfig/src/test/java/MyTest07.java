import cn.jie.config.JieConfig;
import cn.jie.po.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest07 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JieConfig.class);

        User getUser = context.getBean("user", User.class);

        System.out.println(getUser.toString());
    }
}
