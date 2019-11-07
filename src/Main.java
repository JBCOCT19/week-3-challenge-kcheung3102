import com.sun.source.tree.UsesTree;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        ArrayList<Resume> resumes  = new ArrayList<>();



        System.out.println("Would you like to create a resume? (y/n)");
        str = input.nextLine();
        if(!str.equalsIgnoreCase("n")) {
            Resume userResume = getUserResume();
            System.out.println(userResume.displayText());
        }
        input.close();
    }

    private static Resume getUserResume() {
        String name = getUserName();
        String email = getUserEmail();
        String phoneNumber = getUserPhoneNumber();
        ArrayList<Education> educationList = getUserEducation();
        ArrayList<Experience> experienceList = getUserExperience();
        ArrayList<Skills> skillList = getUserSkill();
        return new Resume(name,email,phoneNumber,educationList,experienceList,skillList);
    }

    private static String getUserEmail() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Email: ");
        return input.nextLine();
    }

    private static String getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        return input.nextLine();
    }

    private static String getUserPhoneNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Phone Number: ");
        return input.nextLine();
    }

    private static ArrayList<Education> getUserEducation() {
        ArrayList<Education> educationList = new ArrayList<>();
        String degreeType, major, school;
        int gradYear;
        Boolean toContinue = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Education-----");
            System.out.println("Enter Degree Type: ");
            degreeType = input.nextLine();
            System.out.println("Enter Major: ");
            major = input.nextLine();
            System.out.println("Enter School: ");
            school = input.nextLine();
            System.out.println("Enter Graduation Year: ");
            gradYear = input.nextInt();

            //adds the data into ArrayList
            educationList.add(new Education(degreeType, major, school, gradYear));

            System.out.println("Would you like to enter another Educational Achievements?(y/n)");
            input.nextLine();
            String str = input.nextLine();
            if(str.equalsIgnoreCase("n")) {
                toContinue = false;
            }

        } while(toContinue);

        return educationList;
    }

    private static ArrayList<Experience> getUserExperience() {
        ArrayList<Experience> experiences = new ArrayList<>();
        String company, title, description, startDate, endDate;
        Boolean toContinue = true;
        Scanner input = new Scanner(System.in);
    do {
        System.out.println("Experience-----");
        System.out.println("Enter Company Name: ");
        company = input.nextLine();
        System.out.println("Enter Title: ");
        title = input.nextLine();
        System.out.println("Enter Description: ");
        description = input.nextLine();
        System.out.println("Enter Start Date: ");
        startDate = input.nextLine();
        System.out.println("End Date: ");
        endDate = input.nextLine();

        experiences.add(new Experience(company, title, description, startDate, endDate));

        System.out.println("Would you like to enter more Experience Criteria?(y/n)");
        String str = input.nextLine();
        if(str.equalsIgnoreCase("n")) {
            toContinue = false;
        }

    } while(toContinue);

        return experiences;
    }

    private static ArrayList<Skills> getUserSkill() {
        ArrayList<Skills> skillList = new ArrayList<>();
        String skillName, rating;
        Boolean toContinue = true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Skills-----");
            System.out.println("Enter Skill Name: ");
            skillName = input.nextLine();
            System.out.println("Fundamental, Novice, Intermediate, Advanced or Expert?");
            rating = input.nextLine();

            skillList.add(new Skills(skillName, rating));

            System.out.println("Do you want another skill?(y/n)");
            String str = input.nextLine();
            if(str.equalsIgnoreCase("n")) {
                toContinue = false;
            }

        } while (toContinue);

            return skillList;
    }
}








//testing code

/* Resume bob = new Resume("bob", "bob123@gmail.com","201-312-3213",
                new ArrayList<> (Arrays.asList(
                        new Education("BS","Criminal Justice","University of Maryland", 2013),
                        new Education("MBA", "Business Administration and Marketing", "Georgetown University", 2018))),

                new ArrayList<>(Arrays.asList(
                        new Experience("Pearson and Loc", "Paralegal","Looked at case files","August 2013","June 2015"),
                        new Experience("Whole Foods","Inventory Supervisor", "Managed the inventory of items in each isle.","May 2011","March 2012"))),

                new ArrayList<>(Arrays.asList(
                        new Skills("Javascript", "Proficient"),
                        new Skills("Excel" ,"Proficient"),
                        new Skills("HTML and CSS", "Advanced"),
                        new Skills("Java", "Novice")))
        );

        Resume chad = new Resume("Chad", "Chad123@gmail.com","321-321-4032",
                new ArrayList<>(Arrays.asList(
                        new Education("BA", "Communications", "University of California, Berkley", 2005))),

                new ArrayList<>(Arrays.asList(
                        new Experience("Spotify", "Business Analyst Intern", "analyzed companys data with a team", "January 2004", "March 2005"),
                        new Experience("University of California, Berkley", "Communcations Teacher Assistant", "Go over recent material covered with students and answer any unclear questions", "August 2003","November 2003"))),

                new ArrayList<>(Arrays.asList(
                        new Skills("Excel", "Advanced"),
                        new Skills("HTML", "Proficient")))
        );

        Collections.addAll(resumes, bob, chad); */
