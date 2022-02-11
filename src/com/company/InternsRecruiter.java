package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class InternsRecruiter {
    Scanner scanner = new Scanner(System.in);

    public void internRecruiter() {

        ArrayList<MickieIntern> interns = new ArrayList<>();

        System.out.print("Please enter number of interns you want to recruit : ");
        int numberOfInterns = scanner.nextInt();

        for (int i = 0; i < numberOfInterns; i++) {
            interns.add(new MickieIntern());

            System.out.print("Please enter " +(i+1)+ " intern name : ");
            interns.get(i).setName(scanner.next());

            System.out.print("Please enter intern ID number : ");
            interns.get(i).setIdNumber(scanner.next());

            System.out.print("Please enter intern Sex : ");
            interns.get(i).setSex(scanner.next());

            System.out.print("Please enter intern Age : ");
            interns.get(i).setAge(scanner.nextInt());

        }



        for (int i = 0; i < interns.size(); i++) {
            System.out.println(interns.get(i).getName());
        }





    }
}
