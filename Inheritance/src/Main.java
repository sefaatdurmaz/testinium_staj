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

        student.setNotFull(80,0,90);
        System.out.println("Öğrenci Notları: " + student.getNot1() + ", " + student.getNot2() + ", " + student.getNot3());
        }
        }