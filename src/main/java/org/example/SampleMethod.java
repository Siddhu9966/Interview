package org.example;

public class SampleMethod extends Vehicle
{
    void run(){System.out.println("Bike is running safely");}
    public static void main(String[] args){
        Vehicle s = new Vehicle();
        s.run();
    }
}
