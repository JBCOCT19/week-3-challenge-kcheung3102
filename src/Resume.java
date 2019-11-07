import java.util.ArrayList;

public class Resume {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Education> educationList;
    private ArrayList<Experience> experiences;
    private ArrayList<Skills> skillList;

    public Resume(){};

    public Resume(String name, String email, String phoneNumber, ArrayList<Education> educationList, ArrayList<Experience> experiences, ArrayList<Skills> skillList) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.educationList = educationList;
        this.experiences = experiences;
        this.skillList = skillList;

    }

    public ArrayList<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(ArrayList<Education> educationList) {
        this.educationList = educationList;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<Skills> getSkillList() {
        return skillList;
    }

    public void setSkillList(ArrayList<Skills> skillList) {
        this.skillList = skillList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String displayText() {
        String str = "";
        str += name + "\n" + email + "\n" + phoneNumber + "\n\n";
        str += "Education";
        for(Education e: educationList) {
            str +=  "\n" + e.getDegreeType() + " in " + e.getMajor() + "," + "\n" +
                    e.getSchool() + ", " + e.getGradYear() + "\n\n";
        }
        str += "Experience";
        for(Experience ex: experiences) {
            str +=  "\n" + ex.getTitle() + "\n" +
                    ex.getCompany() + ", " + ex.getStartDate() + " - " + ex.getEndDate() + "\n" +
                   "Responsiblities "  + ", "  + ex.getDescription() + "\n\n";
        }
        str += "Skills";
        for(Skills s: skillList) {
            str += "\n" + s.getSkillName() + ", " + s.getRating();
        }

        return str;


    }


}
