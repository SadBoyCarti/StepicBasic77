package com.stepic.Scanner;
import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;
import java.nio.*;
import java.io.*;



public class TrainingScanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        double sum=0;
        while(sc.hasNext()) {
            try {
                sum += sc.nextDouble();
            } catch (InputMismatchException e) {
                sc.next();  //вот этот момент, что если не считали число, то дальше проскочили
            }
        }
        sc.close();
        System.out.print(new DecimalFormat("#0.000000").format(sum));

    }
}