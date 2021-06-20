import com.auto.wired.XuXu;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest5 {
    @org.junit.Test
    public void test1(){
        org.springframework.context.ApplicationContext context = new ClassPathXmlApplicationContext("aotu.xml");

        XuXu xuXu = (XuXu) context.getBean("xuXu");

        xuXu.getCat().shut();
        xuXu.getDog().shut();


    }
}
