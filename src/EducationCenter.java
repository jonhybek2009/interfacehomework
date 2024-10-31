import java.time.LocalDate;

public abstract class EducationCenter {
    private  String name;
    private  String locatedCountry;
    private LocalDate localDate;
    private int foundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate localDate, int foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public int getFoundationYear() {
        return foundationYear;
    }
}
