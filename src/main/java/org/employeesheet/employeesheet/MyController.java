package org.employeesheet.employeesheet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
    @RequestMapping("m")    //http://localhost:8080/m    m is called endpoint
    public static String myMethod(){
        return "<u>Hello, How are you?</u>";
    }

    @GetMapping("process-form")
    public static String getData(@RequestParam int num1, @RequestParam int num2) {
        int res = num1+num2;
        return String.valueOf(res);
    }

}