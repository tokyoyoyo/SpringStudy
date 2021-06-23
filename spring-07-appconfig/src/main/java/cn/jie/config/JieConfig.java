package cn.jie.config;
import cn.jie.po.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.jie.po")
public class JieConfig {

    @Bean           //注册一个bean，这个方法的名字就相当于id,返回值就相当于class
    public User user(){
        return new User();
    }
}
