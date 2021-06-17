## 常用依赖

```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

```
## 注解说明
- @Autowired :自动装配byType,然后byName。如果Autowired不能唯一自动装配属性，则需要通过@Qualifier（value=“name”）;

- @Nullable ：标记这个注解，说明这个字段可以为null;

- @Resource : 自动装配byName,然后byType;

- @Component ：组件，放在类上，说明这个类被spring管理了，等价于bean