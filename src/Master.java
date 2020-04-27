public class Master extends Student {
    public Master(String fullname, byte age, float average_grade, byte level, String school_name, String university_name, String speciality) {
        super(fullname, age, average_grade, level, school_name, university_name, speciality);
    }
    public void setAge(byte age) {
        if (age >= 22 && age <= 33) {
            this.age = age;
        } else {
            System.err.println("Error");
        }
    }

    public void setLevel(byte level) {
        if (level >= 1 && level <= 3) {
            this.level = level;
        } else {
            System.err.println("Error");
        }
    }

    public void printInfo() {
        System.out.println("> fullname: " + getFullname() + " (" + getAge() + " years)");
        System.out.println("> class: " + getLevel());
        System.out.println("> grade: " + getAverage_grade());
        System.out.println("> University-name: " + getUniversity_name());
        System.out.println("> Speciality: " + getSpeciality());

    }
}
