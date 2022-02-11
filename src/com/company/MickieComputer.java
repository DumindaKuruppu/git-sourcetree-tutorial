package com.company;

import java.util.Scanner;

public class MickieComputer implements Computer {

    String brand;
    String ram ;
    String processor;
    String os;
    int gen ;
    //Boolean isTouch ;

    int time;

    Scanner input = new Scanner(System.in);




    @Override
    public void switchOnOff(){

        System.out.print("what is the time ??? ");
        time = input.nextInt();

        if (time > 9 && time < 18 ){

            System.out.println("You can switch on Lap");

        }

        else {
            System.out.println("You can not switch on lap");
        }

    }



    public  void computerDetails(){

        System.out.print("Enter Brand of your " + type + ": ");
        brand = input.next();

        System.out.print("Ram :");
        ram = input.next();

        System.out.print("Processor :");
        processor = input.next();

        System.out.print("OS Type :");
        os = input.next();

        System.out.print("Generation :");
        gen = input.nextInt();



        System.out.println("Brand of Lap is  " + brand);
        System.out.println("RAM of Lap is  " + ram);
        System.out.println("Processor of Lap is  " + processor);
        System.out.println("Os  is  " + os);
        System.out.println("Generation  is  " + gen);
    }



}
