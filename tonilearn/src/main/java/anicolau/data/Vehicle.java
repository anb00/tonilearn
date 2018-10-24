package anicolau.data;

import anicolau.AppConstants;
import anicolau.exception.IESMyException;


public abstract class Vehicle {
    private String name;
    private String color;
    private Integer numWheels;
    private Double price;
    private Boolean stock;

    //public void setStock(boolean stock) {
        //if (stock== null || stock == 0 ) {
      //      System.out.println("fuera de Stock");
        //}
        //this.stock = stock;
    //}
   ////////// STOCK /////////////

    public  Boolean getStock() { return stock; }

    public void setStock(Boolean stock) { this.stock = stock; }

    /////////// NAME //////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /////////// COLOR /////////////

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    ////// WHEELS //////


    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        if (numWheels == null || numWheels > AppConstants.MAX_WHEELS) {
            throw new IESMyException("Demasiadas ruedas nen!");
        }
        this.numWheels = numWheels;
    }


    /////// PRICE ////
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract void start();

    public void brake() {
        doLog("he frenado");
    }

    /**
     * Prints the message where it should
     *
     * @param message txt
     */
    protected void doLog(String message) {
        System.out.println(message);
    }

    private String showLog(String message) {
        doLog(message);
        return message;
    }
}
