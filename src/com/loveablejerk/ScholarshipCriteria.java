package com.loveablejerk;

public class ScholarshipCriteria {
    private String name;
    private double fatherIncome;
    private String registrationNumber;
    private double totalMarks;
    private  String quranCertificationNumber;
    private double obtainedMarks;


    public ScholarshipCriteria( String name, double fatherIncome, String registrationNumber,
                                double totalMarks, String quranCertificationNumber, double obtainedMarks){
        this.name = name;
        this.fatherIncome = fatherIncome;
        this.registrationNumber = registrationNumber;
        this.totalMarks = totalMarks;
        this.quranCertificationNumber = quranCertificationNumber;
        this.obtainedMarks = obtainedMarks;
    }

    public String getName() {
        return name;
    }

    public double getFatherIncome() {
        return fatherIncome;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public String getQuranCertificationNumber() {
        return quranCertificationNumber;
    }

    public double getObtainedMarks() {
        return obtainedMarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherIncome(double fatherIncome) {
        this.fatherIncome = fatherIncome;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setQuranCertificationNumber(String quranCertificationNumber) {
        this.quranCertificationNumber = quranCertificationNumber;
    }

    public void setObtainedMarks(double obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }
}