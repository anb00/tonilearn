package anicolau.controller;

import anicolau.data.Car;
import anicolau.data.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyFirstController {

    @RequestMapping("/market/")

   // public  Vehicle getMoto(@RequestParam(value = "name", defaultValue = "gomas") String name) {
    public Vehicle getCar(@RequestParam(value = "name", defaultValue = "BrumBrum") String name) {
        //Car car = new Car();
        Car car2;
        car2 = new Car();
        //"aa",3,10000
           // Moto moto = new Moto();
          //  Moto moto2 = new Moto();
       // name = "tony";
        //car.setName("BMW");
        //car.setColor("BLACK");
        //car.setNumWheels(4);
        //car.setPrice(3.500);
        //car.setStock(true);
        /////////////////////////
        // BMW
        /////////////////////////
        car2.setName("SEAT");
        car2.setColor("WHITE");
        car2.setNumWheels(4);
        car2.setPrice(13.000);
        car2.setStock(true);
        return car2;

          //  System.out.println("Este es el auto dos:"+car2.name("sdf"));

        // return moto2;
}
}

