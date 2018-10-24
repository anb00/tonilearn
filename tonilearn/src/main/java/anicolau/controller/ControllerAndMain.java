package anicolau.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class ControllerAndMain {

@RequestMapping("/market")
public String hello() {
    return "<h1>This is the Section Market</h1>";
}




    public static void main(String[] args){
        SpringApplication.run(ControllerAndMain.class,args);
    }





}
