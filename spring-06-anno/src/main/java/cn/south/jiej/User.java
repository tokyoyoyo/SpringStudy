package cn.south.jiej;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component  组件            等价于<bean id="user" class="cn.south.jiej.user"/>
@Component
@Scope("prototype")
public class User {

    //@Value("jiege")       等价于<property name="name" value="jiege"/>
    @Value("jieGe")
    public String name;

    @Value("jieGe22")
    public void setName(String name) {
        this.name = name;
    }


}
