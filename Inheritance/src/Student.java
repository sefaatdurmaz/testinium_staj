public class Student {
    private String name;
    private String surname;
    private String studentNumber;
    private String studentClass;
    private int not1;
    private int not2;
    private int not3;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getNot1() {
        return not1;
    }

    public void setNot1(int not1) {
        this.not1 = not1;
    }

    public int getNot2() {
        return not2;
    }

    public void setNot2(int not2) {
        this.not2 = not2;
    }

    public int getNot3() {
        return not3;
    }

    public void setNot3(int not3) {
        this.not3 = not3;
    }
    public void setNotFull(int not1, int not2, int not3) {
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }
}