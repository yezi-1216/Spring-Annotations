package helloworld.spring;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/*
 *http://www.cnblogs.com/xiaoxi/p/5935009.html
 *这里@Autowired注解的意思就是，当Spring发现@Autowired注解时，将自动在代码上下文中找到和其匹配（默认是类型匹配）的Bean，并自动注入到相应的地方去。
 *@Autowired注解要去寻找的是一个Bean,但在xml中找不到对应的Bean,可以通过(required=false)让其返回null
 *@Autowired顾名思义，就是自动装配，其作用是为了消除代码Java代码里面的getter/setter与bean属性中的property,getter/setter可以增强类的隐藏性
 * 
 */

/*
@Service注解，其实做了两件事情：
(1)、声明Zoo.java是一个bean，这点很重要，因为Zoo.java是一个bean，其他的类才可以使用@Autowired将Zoo作为一个成员变量自动注入。
(2)、Zoo.java在bean中的id是"zoo"，即类名且首字母小写。

如果想让Zoo.java在Spring容器中的名字叫做"Zoo",可以采用这种方法@Service("Zoo")

使用@Service就不用再Beans.xml文件中配置bean了,spring配置文件里面只有一个自动扫描的标签,增强Java代码的内聚性并进一步减少配置文件

 */
@Service
public class Zoo {
	
	@Autowired(required=false)		
	private Tiger tiger;
	
	@Autowired(required=false)
    private Monkey monkey;
    
    
    public String toString(){
        return tiger + "\n" + monkey;
    }

}



