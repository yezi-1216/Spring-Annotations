package helloworld.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import helloworld.spring.helloworld;

/**
 * Hello world!
 *
 */

public class App 
{
	
    public static void main( String[] args )
    {
    	//使用ClassPathXmlApplicationContext()创建一个容器，从Beans.xml中读取配置信息
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/Beans.xml");
    	helloworld obj = (helloworld) context.getBean("helloworld");
    	obj.setMessage("11111111111111");
    	obj.printMessage();
    	
        /*
         *1. 首先会运行main()语句，Spring框架使用ClassPathXmlApplicationContext()首先创建一个容器。
		 *2. 这个容器从Beans.xml中读取配置信息，并根据配置信息来创建bean(也就是对象)，每个bean有唯一的id。
		 *3. 然后通过context.getBean()找到这个id的bean，获取对象的引用。
	     *4. 通过对象的引用调用printMessage()方法来打印信息。
         */
    	
        Zoo zoo = (Zoo) context.getBean("zoo");
        System.out.println(zoo.toString());
        
        System.out.println("**********************");
        
        System.out.println(context.getBean(Zoo.class).toString());
        
        
    }
}
