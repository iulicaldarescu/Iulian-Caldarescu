package lab3;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;

    public Person(String name, String job, String university, String drivingLicense, boolean isMarried) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
