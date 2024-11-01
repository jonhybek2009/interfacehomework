import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter school1 = new School("Школа №1", "Россия", LocalDate.of(2000, 1, 1), 2001);
        EducationCenter university1 = new University("Университет №1", "США", LocalDate.of(1900, 1, 1), 2007);
        EducationCenter college1 = new College("Колледж №1", "Канада", LocalDate.of(1985, 1, 1), 1998);
        EducationCenter school2 = new School("Школа №2", "Франция", LocalDate.of(1995, 1, 1), 1988);
        EducationCenter university2 = new University("Университет №2", "Германия", LocalDate.of(1800, 1, 1), 2011);
        EducationCenter college2 = new College("Колледж №2", "Австралия", LocalDate.of(2005, 1, 1), 2004);

        Student[] students = new Student[10];
        students[0] = new Student("Студент1 ", 'М', school1, 3);
        students[1] = new Student("Студент2 ", 'Ж', university1, 4);
        students[2] = new Student("Студент3 ", 'М', college1, 2);
        students[3] = new Student("Студент4 ", 'Ж', school2, 3);
        students[4] = new Student("Студент  ", 'М', university2, 5);
        students[5] = new Student("Студент6 ", 'Ж', college2, 1);
        students[6] = new Student("Студент7 ", 'М', school1, 2);
        students[7] = new Student("Студент8 ", 'Ж', university1, 1);
        students[8] = new Student("Студент9 ", 'М', college1, 3);
        students[9] = new Student("Студент10 ", 'Ж', school2, 2);

        for (Student student : students) {
            System.out.println("Имя: " + student.getName());
            System.out.println("Пол: " + student.getGender());
            student.getStudentEducationCenter();
            student.getStudentStudyingYear();
            System.out.println("место где он учится: " + student.getEducationCenter().getName());
            System.out.println("Страна в котором находится учебное заведение: " + student.getEducationCenter().getLocatedCountry());
            System.out.println("сколько лет/год учится студент: " + student.getYearOfStudy());
            System.out.println("в каком году основан учебное заведение: " + student.getEducationCenter().getFoundationYear());
            System.out.println();


        }
    }
}





