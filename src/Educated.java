public class Educated {
     String fullname;     // ифо
     byte age;          // возраст
     float average_grade; // сред бал
     byte level;          // уровень ( напр  5-ый класс )



    public Educated(String fullname, byte age, float average_grade, byte level) {// добавить конструктор и геттеры сеттеры для всех свойств
        setFullname(fullname);
        setAge(age);
        setAverage_grade(average_grade);
        setLevel(level);
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAge(byte age) {

        this.age = age;

    }


    public void setAverage_grade(float average_grade) { // добавить проверку на запись "average_grade" диапазон 1..10
        if (average_grade >= 1 && average_grade <= 10) {
            this.average_grade = average_grade;
        }

    }

    public void setLevel(byte level) {
        this.level = level;
    }


    public String getFullname() {
        return fullname;
    }


    public byte getAge() {
        return age;
    }

    public float getAverage_grade() {
        return average_grade;
    }

    public byte getLevel() {
        return level;
    }

    public void printInfo() {
        System.out.println("> fullname: " + getFullname() + " (" + getAge() + " years)");
        System.out.println("> class: " + getLevel());
        System.out.println("> grade: " + getAverage_grade());
    }
    // добавить метод printInfo() который выводит инфу об этом человеке так
    // > fullname: John Doe Jr. (17 years)
    // > class: 10
    // > grade: 9.75
}
