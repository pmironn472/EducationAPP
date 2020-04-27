public class EducationInheritApp {
    public static void main(String[] args) {
        Educated e1 = new Educated("John Doe Jr.", (byte) 17, 9.75f, (byte) 10);
        e1.printInfo();

        System.out.println();

        Pupil p1 = new Pupil("John Bred Jr.", (byte) 15, 8.12f, (byte) 9, "Ion Creanga");
        p1.printInfo();

        System.out.println();

        Student s1 = new Student("Nirca Johns.", (byte) 21, 7.25f, (byte) 5, "", "USM", "Math");
        s1.printInfo();

        System.out.println();

        Master m1 = new Master("Paul Iron",(byte)25,9.63f,(byte)2,"","UTM","Laws");

        m1.printInfo();

    }
}
