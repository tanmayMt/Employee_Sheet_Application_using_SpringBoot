package org.employeesheet.employeesheet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("m")    //http://localhost:8080/m    m is called endpoint
    public static String myMethod(){
        return "<u>Hello, How are you?</u>";
    }
}