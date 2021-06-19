import com.zji.san.Student;
import com.zji.san.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("b4.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.getAddress());
        System.out.println(student.toString());

    }

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userb.xml");

        User user = context.getBean("userC", User.class);

        System.out.println(user.toString());
    }

}

