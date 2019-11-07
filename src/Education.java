public class Education {
    private String degreeType;
    private String major;
    private String school;
    private int gradYear;

    public Education(){};

    public Education(String degreeType, String major, String school, int gradYear){
        this.degreeType = degreeType;
        this.major = major;
        this.school = school;
        this.gradYear = gradYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
