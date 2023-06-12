package Week2.Practise_OBS;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Ayşe Hoca", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Hoca", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ayşe", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,50,50);
        s1.addVerbalNote(50,50,50);
        s1.isPass();

        Student s2 = new Student("Fatma", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addVerbalNote(85,78,90);
        s2.isPass();

        Student s3 = new Student("Hayriye", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addVerbalNote(55,85,75);
        s3.isPass();


    }
}
