package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            ArrayList<Resume> candidate = new ArrayList<>();
            ArrayList<String> jobDescription  = new ArrayList<>();
            Resume person1 = new Resume();
            String oneMore = "Y";

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            PersonalInfo person = new PersonalInfo(name, email);
            person.addpersonal(person);




