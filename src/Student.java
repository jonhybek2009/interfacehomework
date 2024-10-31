public class Student implements Study{
    private String name;
    private char gender;
    private EducationCenter educationCenter;
    private int yearOfStudy;

    public Student(String name, char gender, EducationCenter educationCenter, int yearOfStudy) {
        this.name = name;
        this.gender = gender;
        this.educationCenter = educationCenter;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public void getStudentEducationCenter() {
        System.out.println( name + "учится в" + educationCenter.getName());
    }

    @Override
    public void getStudentStudyingYear() {
        System.out.println(name + " учится в " + yearOfStudy + " году");

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", educationCenter=" + educationCenter +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
