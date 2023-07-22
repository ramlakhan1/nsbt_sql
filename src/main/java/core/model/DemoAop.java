package core.model;

import org.springframework.stereotype.Component;

@Component
public class DemoAop {
    public void name(){
        System.out.println("name is called inside DemoApp");
    }
}
