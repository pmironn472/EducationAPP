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
            super.setLevel(level);
        } else {
            System.err.println("Error");
        }
    }


}
