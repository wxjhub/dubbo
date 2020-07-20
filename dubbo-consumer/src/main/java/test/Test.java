package test;

import com.wxj.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        applicationContext.start();
        System.out.println("开始");
        TestService testService = (TestService) applicationContext.getBean("testService");
        String message = testService.get("1");
        System.out.println("结束:" + message);
        System.in.read();
    }
}
