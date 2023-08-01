package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQL {
    private Connection getDatabaseConnection() {
        // JDBC sürücüsünü yükle
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Veritabanı bağlantı bilgilerini belirle
        String url = "jdbc:mysql://localhost:3306/okulbilgisistemi";
        String user = "root";
        String password = "234669";

        Connection connection = null;
        try {
            // Veritabanı bağlantısını aç
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public void insertStudent(Student student) {
        try {
            Connection connection = getDatabaseConnection();

            String insertQuery = "INSERT INTO students (name, surname, age, identityNo, average) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, student.getName());
            insertStatement.setString(2, student.getSurname());
            insertStatement.setInt(3, student.getAge());
            insertStatement.setString(4, student.getIdentityNo());
            //insertStatement.setDouble(5, student.getAverage());

            insertStatement.executeUpdate();

            insertStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(Student student) {
        try {
            Connection connection = getDatabaseConnection();

            String updateQuery = "UPDATE students SET name=?, surname=?, age=?, identityNo=?, average=? WHERE id=?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setString(1, student.getName());
            updateStatement.setString(2, student.getSurname());
            updateStatement.setInt(3, student.getAge());
            updateStatement.setString(4, student.getIdentityNo());
            //updateStatement.setDouble(5, student.getAverage());
            updateStatement.setInt(6, student.getId());

            updateStatement.executeUpdate();

            updateStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int studentId) {
        try {
            Connection connection = getDatabaseConnection();

            String deleteQuery = "DELETE FROM students WHERE id=?";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
            deleteStatement.setInt(1, studentId);

            deleteStatement.executeUpdate();

            deleteStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try {
            Connection connection = getDatabaseConnection();
            String selectQuery = "SELECT * FROM students";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String identityNo = resultSet.getString("identityNo");
                double average = resultSet.getDouble("average");

                Student student = new Student(id, name, surname, age, identityNo);
                students.add(student);
            }

            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }


    public void insertTeacher(Teacher teacher) {
        try {
            Connection connection = getDatabaseConnection();

            String insertQuery = "INSERT INTO teacher (name, surname, age, identityNo, department, courses) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, teacher.getName());
            insertStatement.setString(2, teacher.getSurname());
            insertStatement.setInt(3, teacher.getAge());
            insertStatement.setString(4, teacher.getIdentityNo());
            insertStatement.setString(5, teacher.getDepartment());
            insertStatement.setString(6, teacher.getCourses()); // courses alanı String olarak veritabanına kaydedilecek


            insertStatement.executeUpdate();

            insertStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateTeacher(Teacher teacher) {
        try {
            Connection connection = getDatabaseConnection();

            String updateQuery = "UPDATE teacher SET name=?, surname=?, age=?, identityNo=?, department=?, courses=? WHERE id=?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setString(1, teacher.getName());
            updateStatement.setString(2, teacher.getSurname());
            updateStatement.setInt(3, teacher.getAge());
            updateStatement.setString(4, teacher.getIdentityNo());
            updateStatement.setString(5, teacher.getDepartment());
            updateStatement.setString(6, teacher.getCourses()); // Güncellenmiş courses alanı
            updateStatement.setInt(7, teacher.getId());


            updateStatement.executeUpdate();

            updateStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteTeacher(int teacherId) {
        try {
            Connection connection = getDatabaseConnection();

            String deleteQuery = "DELETE FROM teacher WHERE id=?";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
            deleteStatement.setInt(1, teacherId);

            deleteStatement.executeUpdate();

            deleteStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        try {
            Connection connection = getDatabaseConnection();
            String selectQuery = "SELECT * FROM teacher";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);

            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String identityNo = resultSet.getString("identityNo");
                String department = resultSet.getString("department");
                String courses = resultSet.getString("courses");

                Teacher teacher = new Teacher(id, name, surname, age, identityNo, department, courses);
                teachers.add(teacher);
            }

            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return teachers;
    }



    public void insertPersonel(Personel personel) {
        try {
            Connection connection = getDatabaseConnection();

            String insertQuery = "INSERT INTO personel (name, surname, age, identityNo, job) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, personel.getName());
            insertStatement.setString(2, personel.getSurname());
            insertStatement.setInt(3, personel.getAge());
            insertStatement.setString(4, personel.getIdentityNo());
            insertStatement.setString(5, personel.getJob());

            insertStatement.executeUpdate();

            insertStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePersonel(Personel personel) {
        try {
            Connection connection = getDatabaseConnection();

            String updateQuery = "UPDATE personel SET name=?, surname=?, age=?, identityNo=?, job=? WHERE id=?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setString(1, personel.getName());
            updateStatement.setString(2, personel.getSurname());
            updateStatement.setInt(3, personel.getAge());
            updateStatement.setString(4, personel.getIdentityNo());
            updateStatement.setString(5, personel.getJob());
            updateStatement.setInt(6, personel.getId());

            updateStatement.executeUpdate();

            updateStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePersonel(int personelId) {
        try {
            Connection connection = getDatabaseConnection();

            String deleteQuery = "DELETE FROM personel WHERE id=?";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
            deleteStatement.setInt(1, personelId);

            deleteStatement.executeUpdate();

            deleteStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Personel> getPersonels() {
        List<Personel> personels = new ArrayList<>();

        try {
            Connection connection = getDatabaseConnection();

            String selectQuery = "SELECT * FROM personel";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);

            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String identityNo = resultSet.getString("identityNo");
                String job = resultSet.getString("job");

                Personel personel = new Personel(id, name, surname, age, identityNo, job);
                personels.add(personel);

                System.out.println("ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Identity No: " + identityNo + ", Job: " + job);
            }

            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Veritabanı hatası durumunda null döndür
        }

        return personels; // Listeyi geri döndür
    }


    public Student getStudentById(int studentId) {
        try {
            Connection connection = getDatabaseConnection();

            String query = "SELECT * FROM students WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, studentId);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String identityNo = resultSet.getString("identityNo");
                double average = resultSet.getDouble("average");

                return new Student(id, name, surname, age, identityNo);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Teacher getTeacherById(int teacherId) {
        Teacher teacher = null;

        try {
            Connection connection = getDatabaseConnection();
            String query = "SELECT * FROM teacher WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, teacherId);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String identityNo = resultSet.getString("identityNo");
                String department = resultSet.getString("department");
                String courses = resultSet.getString("courses");

                teacher = new Teacher(id, name, surname, age, identityNo, department, courses);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teacher;
    }
    public Personel getPersonelById(int personelId) {
        Personel personel = null;

        try {
            Connection connection = getDatabaseConnection();
            String query = "SELECT * FROM personel WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,personelId);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String identityNo = resultSet.getString("identityNo");
                String job = resultSet.getString("job");

                return new Personel(id, name, surname, age, identityNo, job);
            }

            resultSet.close();     // sorgu sonucunda dönen verileri okur
            statement.close();     // bu nesne, veritabanına SQL sorgularını göndermek için kullanılır
            connection.close();    // veritabanına bağlantı sağlar.
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Login getLogin(String username) {
        Login login = null;
        try {
            Connection connection = getDatabaseConnection();

            String selectQuery = "SELECT * FROM teacher WHERE username=?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, username);

            ResultSet resultSet = selectStatement.executeQuery();

            // Eğer kullanıcı adına karşılık gelen veri varsa Login nesnesine atama yap
            if (resultSet.next()) {
                String password = resultSet.getString("password");
                login = new Login(username, password);
            }

            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return login;
    }

    /*public boolean checkTeacherLogin(String username, String password) {
        try {
            Connection connection = getDatabaseConnection();

            String selectQuery = "SELECT * FROM teachers WHERE username=? AND password=?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setString(1, username);
            selectStatement.setString(2, password);

            ResultSet resultSet = selectStatement.executeQuery();

            boolean loginSuccessful = resultSet.next();

            resultSet.close();
            selectStatement.close();
            connection.close();

            return loginSuccessful;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }*/
    public Student getStudentByidentityNo(String identityNo) {
        Student student = null;

        try {
            Connection connection = getDatabaseConnection();
            String query = "SELECT * FROM students WHERE identityNo = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, identityNo);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");

                student = new Student(id, name, surname, age, identityNo);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
    public void updateStudentAverage(Student student, double average) {
        try {
            Connection connection = getDatabaseConnection();
            String updateQuery = "UPDATE students SET average = ? WHERE id = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setDouble(1, average);
            updateStatement.setInt(2, student.getId());

            updateStatement.executeUpdate();
            updateStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}


