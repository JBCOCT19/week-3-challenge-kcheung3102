import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Resume> resumes  = new ArrayList<>();

        Resume bob = new Resume("bob", "bob123@gmail.com","201-312-3213",
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

        Collections.addAll(resumes, bob, chad);

        for(Resume r: resumes) {
            System.out.println("===============" + "\n" + r.displayText());
        }
    }
}
