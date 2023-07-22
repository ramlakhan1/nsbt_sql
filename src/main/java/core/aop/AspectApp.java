package core.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectApp {
    Logger logger = LogManager.getLogger();
    @Before("execution(public void name(..))")
    public void hi(){
        System.out.println("Aspect is called before execution of name method");
    }
}
