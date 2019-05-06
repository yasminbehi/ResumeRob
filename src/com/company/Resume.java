package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class Resume {


    ArrayList<PersonalInfo> personal   = new ArrayList<>();
    ArrayList<Education>    education  = new ArrayList<>();
    ArrayList<Experience>   experience = new ArrayList<>();
    ArrayList<Skills>      skill       = new ArrayList<>();

    public Resume() {

    }

    public Resume(ArrayList<PersonalInfo> infos, ArrayList<Education> edu, ArrayList<Experience> exp, ArrayList<Skills> skill) {
        this.personal = infos;
        this.education   = edu;
        this.experience   = exp;
        this.skill = skill;
    }
    public ArrayList<PersonalInfo> getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalInfo person) {
        personal.add(person);
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(Education edu) {
        education.add(edu);
    }

    public ArrayList<Experience> getExprience() {
        return experience;
    }

    public void setExperience(Experience exp) {
        experience.add (exp);
    }

    public ArrayList<Skills> getSkill() {
        return skill;
    }

    public void setSkill(Skills skil) {
        skill.add(skil);
    }



}

