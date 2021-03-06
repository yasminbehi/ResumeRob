package com.company;

public class Education {

    private String degree;
    private String major;
    private String uniName;
    private int gradYear;


    public Education() {
    }

    public Education(String degree, String major, String uniName, int gradYear) {
        this.degree = degree;
        this.major = major;
        this.uniName = uniName;
        this.gradYear = gradYear;
    }
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
    public String toString(){

        return ("\n" +getDegree()+ "in" + getMajor()+ ","+ "\n"+getUniName()+ "," +getGradYear());
    }
}

