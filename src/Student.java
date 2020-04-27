import java.util.logging.Level;

public class Student extends Pupil {
    String university_name;
    String speciality;

    public Student(String fullname, byte age, float average_grade, byte level, String school_name, String university_name, String speciality) {
        super(fullname, age, average_grade, level, school_name);
        setUniversity_name(university_name);
        setSpeciality(speciality);
    }


    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAge(byte age) {
        if (age >= 19 && age <= 30) {
            this.age = age;
        } else {
            System.err.println("Error");
        }
    }

    public void setLevel(byte level) {
        if (level >= 1 && level <= 7) {
            super.setLevel(level);
        } else {
            System.err.println("Error");
        }
    }

    public String getUniversity_name() {
        return university_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void printInfo() {
        System.out.println("> fullname: " + getFullname() + " (" + getAge() + " years)");
        System.out.println("> class: " + getLevel());
        System.out.println("> grade: " + getAverage_grade());
        System.out.println("> University-name: " + getUniversity_name());
        System.out.println("> Speciality: " + getSpeciality());

    }
}

