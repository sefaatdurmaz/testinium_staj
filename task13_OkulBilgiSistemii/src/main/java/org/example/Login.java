package org.example;

import org.example.SQL;
import org.example.Student;

import java.util.Scanner;

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public boolean login() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String enteredUsername = input.next();

        System.out.print("Enter your password: ");
        String enteredPassword = input.next();

        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }

    /*public static void teacherLogin() {
        String username = "teacher_username"; // Öğretmenin kullanıcı adını burada belirleyin
        String password = "teacher_password"; // Öğretmenin şifresini burada belirleyin

        Scanner input = new Scanner(System.in);

        Login teacherLogin = new Login(username, password);
        if (teacherLogin.login()) {
            SQL sql = new SQL();
            System.out.print("Enter student ID to update: ");
            int studentIdToUpdate = input.nextInt();

            Student existingStudent = sql.getStudentById(studentIdToUpdate);
            if (existingStudent == null) {
                System.out.println("Student with ID " + studentIdToUpdate + " not found.");
            } else {
                System.out.print("Enter updated name: ");
                String updatedName = input.next();
                existingStudent.setName(updatedName);

                System.out.print("Enter updated surname: ");
                String updatedSurname = input.next();
                existingStudent.setSurname(updatedSurname);

                System.out.print("Enter updated age: ");
                int updatedAge = input.nextInt();
                existingStudent.setAge(updatedAge);

                System.out.print("Enter updated identity number: ");
                String updatedIdentityNo = input.next();
                existingStudent.setIdentityNo(updatedIdentityNo);

                System.out.print("Enter updated average: ");
                double updatedAverage = input.nextDouble();
                //existingStudent.setAverage(updatedAverage);

                sql.updateStudent(existingStudent);
                System.out.println("Student with ID " + studentIdToUpdate + " updated successfully.");
            }
        } else {
            System.out.println("Invalid username or password. Not allowed to enter grades.");
        }
    }*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
