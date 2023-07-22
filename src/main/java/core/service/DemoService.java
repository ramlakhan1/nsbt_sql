package core.service;

import core.aop.Calculator;
import core.model.DemoAop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoService {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        ApplicationContext context = new ClassPathXmlApplicationContext("Demo.xml");
//        DemoAop demoAop = (DemoAop) context.getBean("demoAop");
        Calculator calculator = (Calculator) context.getBean("calculator");
        logger.info("Sum of the elements : "+calculator.add(2, 3));
//        logger.info(calculator.add("Addition of two String : " +"Anmol", "Choudhary"));
//        logger.info("Sum of Double number is : " + calculator.add( 0.2, 0.5));
//        logger.info("Division : " + calculator.divide(5, 1));
//        logger.info("Division of double : " + 0.5, 0.2);
//        logger.info("multiplication is : " + calculator.multiply(3,4));
//        logger.info("substraction is : " + calculator.subtract(3, 2));
//        demoAop.name();
    }
}
