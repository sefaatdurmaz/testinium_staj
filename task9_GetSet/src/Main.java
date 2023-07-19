public class Main {
    public static void main(String[] args) {

        Student student = new Student("Şefaat", "Durmaz");
        student.setStudentNumber("723");
        student.setStudentClass("11/B");
        student.setNot1(87);
        student.setNot2(93);
        student.setNot3(100);

        System.out.println("Öğrenci Adı: " + student.getName());
        System.out.println("Öğrenci Soyadı: " + student.getSurname());
        System.out.println("Öğrenci Okul No: " + student.getStudentNumber());
        System.out.println("Öğrenci Sınıfı: " + student.getStudentClass());
        System.out.println("Öğrenci Notları: " + student.getNot1() + ", " + student.getNot2() + ", " + student.getNot3());

        student.setNotFull(80,30,90);
        System.out.println("Güncel Öğrenci Notları: " + student.getNot1() + ", " + student.getNot2() + ", " + student.getNot3());

        student.setNotFullWithNot2AndNot3(90,100);
        System.out.println("2 ve 3 için güncel öğrenci notları: " + student.getNot1() + ", " + student.getNot2() + ", " + student.getNot3());

        student.setNotFullWithNot1AndNot3(23,87);
        System.out.println("1 ve 3 için güncel Öğrenci Notları: " + student.getNot1() + ", " + student.getNot2() + ", " + student.getNot3());

        student.setNotFull(80,73);
        System.out.println("1 ve 2 için güncel Öğrenci Notları: " + student.getNot1() + ", " + student.getNot2() + ", " + student.getNot3());




    }
}