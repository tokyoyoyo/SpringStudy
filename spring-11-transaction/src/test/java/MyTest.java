import com.jie.dao.UserMapper;
import com.jie.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        UserMapper mapper = new ClassPathXmlApplicationContext("applicationContext.xml").getBean("userMapper", UserMapper.class);
        for (User user : mapper.selectAll()) {
            System.out.println(user);
        }

    }
}
