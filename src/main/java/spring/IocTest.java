package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.bean.A;
import spring.selftag.User;

public class IocTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        A a = (A) context.getBean("beanA");
        System.out.println(a);
        User user = (User) context.getBean("selfTagBean");
        System.out.println(user);
    }


}
