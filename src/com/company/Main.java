package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayInMonth;
        System.out.println("nhap thang can tim vao day");
        int month = sc.nextInt();
        switch (month){
            case 2:
                dayInMonth = "29 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            default:
                dayInMonth = "";


        }
        if(dayInMonth == ""){
            System.out.println("invalid");
        }else {
            System.out.println(" the " + month + " has " + dayInMonth);
        }
    }
}
