package org.example;
import java.util.Scanner;
import java.util.List;

public class Home {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println();
        System.out.println("*** Okul Bilgi Sistemine Hoş geldiniz ! ***");
        SQL sql = new SQL();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------");
            System.out.println("-------- MENU --------");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All Students");
            System.out.println("---------------------------");
            System.out.println("5. Add Teacher");
            System.out.println("6. Update Teacher");
            System.out.println("7. Delete Teacher");
            System.out.println("8. Show All Teachers");
            System.out.println("---------------------------");
            System.out.println("9. Add Personel");
            System.out.println("10. Update Personel");
            System.out.println("11. Delete Personel");
            System.out.println("12. Show All Personels");
            System.out.println("---------------------------");
            System.out.println("13. Teacher Login");
            System.out.println("---------------------------");
            System.out.println("0. Exit");
            System.out.println("---------------------------");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Öğrenci ekleme işlemi
                    System.out.print("Enter name: ");
                    String name = input.next();
                    System.out.print("Enter surname: ");
                    String surname = input.next();
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    System.out.print("Enter identity number: ");
                    String identityNo = input.next();
                    /*System.out.print("Enter average: ");
                    double average = input.nextDouble();*/

                    Student student = new Student(1, name, surname, age, identityNo);
                    sql.insertStudent(student);
                    System.out.println("Öğrenci başarıyla eklendi !");
                    break;
                case 2:
                    // Öğrenci güncelleme işlemi
                    System.out.print("Enter student ID to update: ");
                    int studentIdToUpdate = input.nextInt();

                    // Öğrenci var mı diye kontrol et
                    Student existingStudent = sql.getStudentById(studentIdToUpdate);
                    if (existingStudent == null) {
                        System.out.println("Student with ID " + studentIdToUpdate + " not found.");
                    } else {
                        // Güncellenecek öğrencinin yeni bilgilerini al

                        String updatedName = null;
                        String updatedSurname = null;
                        int updatedAge = 0;
                        String updatedIdentityNo = null;
                        //double updatedAverage = 0.0;

                        System.out.println("1. Update Name");
                        System.out.println("2. Update Surname");
                        System.out.println("3. Update Age");
                        System.out.println("4. Update Identity No");
                        //System.out.println("5. Update Average");

                        System.out.print("Select the user information you want to update : ");
                        int studentUpdate = input.nextInt();

                        switch(studentUpdate) {
                            case 1:
                                System.out.print("Enter updated name: ");
                                updatedName = input.next();
                                break;
                            case 2:
                                System.out.print("Enter updated surname: ");
                                updatedSurname = input.next();
                                break;
                            case 3:
                                System.out.print("Enter updated age: ");
                                updatedAge = input.nextInt();
                                break;
                            case 4:
                                System.out.print("Enter updated identity number: ");
                                updatedIdentityNo = input.next();
                                break;
                            /*case 5:
                                System.out.print("Enter updated average: ");
                                updatedAverage = input.nextDouble();
                                break;*/
                            default:
                                System.out.println("Geçersiz seçim. Lütfen tekrar deneyin !");
                        }
                        // Yeni bilgilerle öğrenci nesnesini oluştur
                        Student updatedStudent = new Student(
                                studentIdToUpdate,
                                updatedName != null ? updatedName : existingStudent.getName(),
                                updatedSurname != null ? updatedSurname : existingStudent.getSurname(),
                                updatedAge != 0 ? updatedAge : existingStudent.getAge(),
                                updatedIdentityNo != null ? updatedIdentityNo : existingStudent.getIdentityNo()
                                //updatedAverage != 0.0 ? updatedAverage : existingStudent.getAverage()
                        );
                        // Öğrenciyi güncelle
                        sql.updateStudent(updatedStudent);
                        System.out.println("Student with ID " + studentIdToUpdate + " updated successfully.");
                    }
                    break;

                case 3:
                    // Öğrenci silme işlemi
                    System.out.print("Enter student ID to delete: ");
                    int studentIdToDelete = input.nextInt();

                    // Öğrenci var mı diye kontrol et
                    Student existingStudentToDelete = sql.getStudentById(studentIdToDelete);
                    if (existingStudentToDelete == null) {
                        System.out.println("Student with ID " + studentIdToDelete + " not found.");
                    } else {
                        // Öğrenciyi sil
                        sql.deleteStudent(studentIdToDelete);
                        System.out.println("Student with ID " + studentIdToDelete + " successfully deleted.");
                    }
                    break;
                case 4:
                    // Tüm öğrencileri gösterme işlemi
                    List<Student> students = sql.getStudents();
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students) {
                            s.print();
                            System.out.println("---------------");
                        }
                    }
                    break;
                case 5:
                    // Öğretmen ekleme işlemi
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter surname: ");
                    surname = input.next();
                    System.out.print("Enter age: ");
                    age = input.nextInt();
                    System.out.print("Enter identity number: ");
                    identityNo = input.next();
                    System.out.print("Enter department: ");
                    String department = input.next();
                    System.out.print("Enter courses: ");
                    String courses = input.next();

                    Teacher teacher = new Teacher(1, name, surname, age, identityNo, department, courses);
                    sql.insertTeacher(teacher);
                    System.out.println("Öğretmen başarıyla eklendi !");
                    break;

                case 6:
                    // Öğretmen güncelleme işlemi
                    System.out.print("Enter teacher ID to update: ");
                    int teacherIdToUpdate = input.nextInt();

                    // Öğretmen var mı diye kontrol et
                    Teacher existingTeacher = sql.getTeacherById(teacherIdToUpdate);
                    if (existingTeacher == null) {
                        System.out.println("Teacher with ID " + teacherIdToUpdate + " not found.");
                    } else {
                        // Güncellenecek öğretmenin yeni bilgilerini al
                        String updatedName = null;
                        String updatedSurname = null;
                        int updatedAge = 0;
                        String updatedIdentityNo = null;
                        String updatedDepartment = null;
                        String updatedCourses = null;

                        System.out.println("1. Update Name");
                        System.out.println("2. Update Surname");
                        System.out.println("3. Update Age");
                        System.out.println("4. Update Identity No");
                        System.out.println("5. Update Department");
                        System.out.println("6. Update Courses");


                        System.out.print("Select the user information you want to update : ");
                        int teacherUpdate = input.nextInt();

                        switch(teacherUpdate) {
                            case 1:
                                System.out.print("Enter updated name: ");
                                updatedName = input.next();
                                break;
                            case 2:
                                System.out.print("Enter updated surname: ");
                                updatedSurname = input.next();
                                break;
                            case 3:
                                System.out.print("Enter updated age: ");
                                updatedAge = input.nextInt();
                                break;
                            case 4:
                                System.out.print("Enter updated identity number: ");
                                updatedIdentityNo = input.next();
                                break;
                            case 5:
                                System.out.print("Enter updated department: ");
                                updatedDepartment = input.next();
                                break;
                            case 6:
                                System.out.print("Enter updated courses: ");
                                updatedCourses = input.next();
                                break;
                            default:
                                System.out.println("Geçersiz seçim. Lütfen tekrar deneyin !");
                        }
                        Teacher updatedTeacher = new Teacher (
                                teacherIdToUpdate,
                                updatedName != null ? updatedName : existingTeacher.getName(),
                                updatedSurname != null ? updatedSurname : existingTeacher.getSurname(),
                                updatedAge != 0 ? updatedAge : existingTeacher.getAge(),
                                updatedIdentityNo != null ? updatedIdentityNo : existingTeacher.getIdentityNo(),
                                updatedDepartment != null ? updatedDepartment : existingTeacher.getDepartment(),
                                updatedCourses != null ? updatedCourses : existingTeacher.getCourses()
                        );
                        // Öğretmeni güncelle
                        sql.updateTeacher(updatedTeacher);
                        System.out.println("Teacher with ID " + teacherIdToUpdate + " updated successfully.");
                    }
                    break;
                case 7:
                    System.out.print("Enter student ID to delete: ");
                    int teacherIdToDelete = input.nextInt();

                    // Teacher var mı diye kontrol et
                    Teacher existingTeacherToDelete = sql.getTeacherById(teacherIdToDelete);
                    if (existingTeacherToDelete == null) {
                        System.out.println("Teacher with ID " + teacherIdToDelete + " not found.");
                    } else {
                        // Teacher sil
                        sql.deleteTeacher(teacherIdToDelete);
                        System.out.println("Teacher with ID " + teacherIdToDelete + " successfully deleted.");
                    }
                    break;

                case 8:
                    List<Teacher> teachers = sql.getTeachers();
                    if (!teachers.isEmpty()) {
                        for (Teacher t : teachers) {
                            t.print();
                            System.out.println("-------------");
                        }
                    } else {
                        System.out.println("Öğretmen bulunamadı.");
                    }
                    break;
                case 9:
                    System.out.print("Enter name : ");
                    name = input.next();
                    System.out.print("Enter surname: ");
                    surname = input.next();
                    System.out.print("Enter age: ");
                    age = input.nextInt();
                    System.out.print("Enter identity number: ");
                    identityNo = input.next();
                    System.out.print("Enter job: ");
                    String job = input.next();

                    Personel personel = new Personel(1,name,surname, age,identityNo,job);
                    sql.insertPersonel(personel);
                    System.out.println("Personel başarıyla eklendi !");

                    break;
                case 10:
                    // Personel update işlemi
                    System.out.print("Enter teacher ID to update: ");
                    int personelIdToUpdate = input.nextInt();

                    Personel existingPersonel = sql.getPersonelById(personelIdToUpdate);
                    if (existingPersonel == null) {
                        System.out.println("Personel with ID " + personelIdToUpdate + " not found.");
                    } else {
                        // Güncellenecek öğretmenin yeni bilgilerini al
                        String updatedName = null;
                        String updatedSurname = null;
                        int updatedAge = 0;
                        String updatedIdentityNo = null;
                        String updatedJob = null;

                        System.out.println("1. Update Name");
                        System.out.println("2. Update Surname");
                        System.out.println("3. Update Age");
                        System.out.println("4. Update Identity No");
                        System.out.println("5. Update Job");

                        System.out.print("Select the user information you want to update : ");
                        int personelUpdate = input.nextInt();

                        switch(personelUpdate) {
                            case 1:
                                System.out.print("Enter updated name: ");
                                updatedName = input.next();
                                break;
                            case 2:
                                System.out.print("Enter updated surname: ");
                                updatedSurname = input.next();
                                break;
                            case 3:
                                System.out.print("Enter updated age: ");
                                updatedAge = input.nextInt();
                                break;
                            case 4:
                                System.out.print("Enter updated identity number: ");
                                updatedIdentityNo = input.next();
                                break;
                            case 5:
                                System.out.print("Enter updated job: ");
                                updatedJob = input.next();
                                break;
                            default:
                                System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                        }
                        // Yeni bilgilerle personel nesnesini oluştur
                        Personel updatedPersonel = new Personel(
                                personelIdToUpdate,
                                updatedName != null ? updatedName : existingPersonel.getName(),
                                updatedSurname != null ? updatedSurname : existingPersonel.getSurname(),
                                updatedAge != 0 ? updatedAge : existingPersonel.getAge(),
                                updatedIdentityNo != null ? updatedIdentityNo : existingPersonel.getIdentityNo(),
                                updatedJob != null ? updatedJob : existingPersonel.getJob()
                        );
                        // Personeli güncelle
                        sql.updatePersonel(updatedPersonel);
                        System.out.println("Teacher with ID " + personelIdToUpdate + " updated successfully.");
                    }
                    break;
                case 11:
                    System.out.print("Enter personel ID to delete: ");
                    int personelIdToDelete = input.nextInt();

                    // Öğrenci var mı diye kontrol et
                    Personel existingPersonelToDelete = sql.getPersonelById(personelIdToDelete);
                    if (existingPersonelToDelete == null) {
                        System.out.println("Personel with ID " + personelIdToDelete + " not found.");
                    } else {
                        // Öğrenciyi sil
                        sql.deletePersonel(personelIdToDelete);
                        System.out.println("Personel with ID " + personelIdToDelete + " successfully deleted.");
                    }
                    break;
                case 12:
                    List<Personel> personels = sql.getPersonels();
                    if (!personels.isEmpty()) {
                        for (Personel p : personels) {
                            p.print();
                            System.out.println("-------------");
                        }
                    } else {
                        System.out.println("Personel bulunamadı.");
                    }
                    break;
                case 13:
                    input = new Scanner(System.in);
                    boolean isLoggedIn = false;
                    boolean exitRequested = false;

                    while (!isLoggedIn && !exitRequested) {
                        System.out.print("Enter your username (or type 'exit' to quit): ");
                        String userPass = input.next();

                        // Check if the user wants to exit
                        if (userPass.equalsIgnoreCase("exit")) {
                            System.out.println("Exiting...");
                            exitRequested = true;
                            break;
                        }

                        // getLogin metodu kullanılarak veritabanından giriş bilgilerini al
                        Login loginT = sql.getLogin(userPass);

                        // Kullanıcı adına karşılık gelen veri yoksa
                        if (loginT == null) {
                            System.out.println("Teacher with username " + userPass + " not found.");
                        } else {
                            // Veritabanından alınan parolayı kullanıcıdan tekrar istemeyin
                            System.out.print("Enter your password: ");
                            String password = input.next();

                            // Giriş yap
                            if (loginT.getPassword().equals(password)) {
                                System.out.println("Login successful!");
                                isLoggedIn = true; // Doğru giriş yapıldığında döngüden çık

                                boolean studentEntryRequested = true;
                                while (studentEntryRequested) {
                                    System.out.print("Enter student's TC number (or type 'exit' to quit): ");
                                    String tcNo = input.next();

                                    // Check if the user wants to exit
                                    if (tcNo.equalsIgnoreCase("exit")) {
                                        System.out.println("Exiting...");
                                        exitRequested = true;
                                        break;
                                    }

                                    // TC kimlik numarasına sahip öğrenciyi veritabanında bulalım
                                    Student s = sql.getStudentByidentityNo(tcNo);

                                    if (s == null) {
                                        System.out.println("Student with TC number " + tcNo + " not found.");
                                    } else {
                                        // Öğrenci bulunduysa not girişi yapalım
                                        System.out.print("Enter the grade: ");
                                        double grade = input.nextDouble();

                                        // Notu öğrenci veritabanında güncelle
                                        sql.updateStudentAverage(s, grade);

                                        System.out.println("Grade entry successful!");
                                    }

                                    System.out.print("Do you want to enter another grade? (yes/no): ");
                                    String continueEntry = input.next();
                                    if (!continueEntry.equalsIgnoreCase("yes")) {
                                        studentEntryRequested = false;
                                    }
                                }
                            } else {
                                System.out.println("Invalid username or password. Access denied.");
                            }
                        }
                    }
                    if (!isLoggedIn && !exitRequested) {
                        System.out.println("Login attempt canceled.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }
}
