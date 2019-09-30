package com.loveablejerk;


import java.util.Scanner;

public class Main {


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        inputGetter.regNo();
        inputGetter.name();

        System.out.println("Which scholarship category you want to apply \n 1) Needy \n 2) Position Holder" +
                "\n 3) Hafiz-e-Quran");
        int category = scan.nextInt();

    }


    private static void getScholarshipTypeInfo(int category) {
        Double fatherIncome = null;
        switch (category) {
            case 1:
                inputGetter.getFatherIncome();
                break;
            case 2:

                inputGetter.getMarks();
                inputGetter.getTotalMarks();
                break;
            case 3:

                inputGetter.getFatherIncome();
                inputGetter.getQuranCertificateNumber();
                break;
            default:
                System.out.println("Wrong category chosen");
                break;
        }
    }


}
