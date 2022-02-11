package com.company;

import java.util.*;
import java.util.Scanner;

import java.time.LocalTime;

public class MickieComputer implements Computer {

    String name;
    String brand;
    String ram ;
    String processor;
    String os;
    int gen ;
    //Boolean isTouch ;

    int time;

    Scanner input = new Scanner(System.in);



    public  void computerDetails(){

        System.out.print("Please Enter your name ");
        name = input.next();

        System.out.print("What is Brand of your Lap " + type + ": ");
        brand = input.next();

        System.out.print("What is Ram size:");
        ram = input.next();

        System.out.print("What is the Processor :");
        processor = input.next();

        System.out.print("What is the OS Currently use :");
        os = input.next();

        System.out.print("Generation :");
        gen = input.nextInt();



        System.out.println( name + "'s Lap is  " + brand + " And "+ ram + " Gb Ram, " + processor + " Processor with " + os +" OS ,, " + gen + " th gen");

    }



    @Override
    public void switchOnOff(){

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        System.out.print("What is the Time ??? ");
        time = input.nextInt();

        if (time > 9 && time < 18 ){

            System.out.println("You can switch on Lap");

        }

        else {
            System.out.println("You can not switch on lap");
        }

    }



}
