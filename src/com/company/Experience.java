package com.company;
import java.util.ArrayList;
public class Experience {

    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String jobDescription;
    private ArrayList<String> jobDesc = new ArrayList<>();

    public Experience() {
    }

    public Experience(String company, String jobTitle, String startDate, String endDate, String jobDescription) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescription = jobDescription;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        jobDesc.add(jobDescription);
    }
   @Override
    public String toString(){
        return("/n" + jobTitle + "\n" + getCompany()+ "," + getStartDate()+ "-"+ "\n" + getJobDescription());
    }
}





