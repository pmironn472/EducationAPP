public class Pupil extends Educated {
    String school_name;


    public Pupil(String fullname, byte age, float average_grade, byte level, String school_name) {
        super(fullname, age, average_grade, level);
        setSchool_name(school_name);

    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }


    public String getSchool_name() {
        return school_name;
    }

    public void setAge(byte age) {
        if (age >= 6 && age <= 20) {
            this.age = age;
        } else {
            System.err.println("Error");
        }
    }

    public void setLevel(byte level) {
        if (level >= 1 && level <= 12) {
            super.setLevel(level);
        } else {
            System.err.println("Error");
        }
    }


    public void printInfo() {
        System.out.println("> fullname: " + getFullname() + " (" + getAge() + " years)");
        System.out.println("> class: " + getLevel());
        System.out.println("> grade: " + getAverage_grade());
        System.out.println("> School-name: " + getSchool_name());

    }
}
