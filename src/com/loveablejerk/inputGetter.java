package com.loveablejerk;

import static com.loveablejerk.Main.scan;

public class inputGetter {

    public static String getQuranCertificateNumber() {
        System.out.println("Enter you quran certificate number");
        return scan.next();
    }

    public static Double getTotalMarks() {
        System.out.println("Enter you total marks");
        return scan.nextDouble();
    }

    public static Double getFatherIncome() {
        System.out.println("Enter you father income");
        return scan.nextDouble();
    }

    public static Double getMarks() {
        System.out.println("Enter your obtained marks");
        return scan.nextDouble();
    }
    public static String name() {
        System.out.println("Enter your name");
        return scan.next();
    }  public static String regNo() {
        System.out.println("Enter your registration");
        return scan.next();
    }
}
