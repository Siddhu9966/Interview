package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Vehicle{
    void run(){
        System.out.println("Vehicle  is running");
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
    }
}
