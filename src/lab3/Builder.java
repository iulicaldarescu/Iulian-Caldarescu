package lab3;

public class Builder{
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;





    public Builder setName(String name) {
        this.name = name;
        return this;
    }


    public Builder setJob(String job) {
        this.job = job;
        return this;
    }


    public Builder setPersonUniversity(String university) {
        this.university = university;
        return this;
    }


    public Builder setPersonDrivingLicence(String drivingLicence) {
        this.drivingLicense = drivingLicence;
        return this;
    }


    public Builder setPersonIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
        return this;
    }

    public Person getPerson(){

        return new Person(name,job,university,drivingLicense,isMarried);
    }
}
