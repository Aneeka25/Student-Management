import java.util.*;

class StudentOperations {
    ArrayList<Student> students;
     public StudentOperations() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added");
    }
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }
    public Student searchStudentByPRN(int prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        return null;
    }
     public List<Student> searchStudentByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }
    public List<Student> searchStudentByBranch(String branch) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getBranch().equalsIgnoreCase(branch)) {
                result.add(student);
            }
        }
        return result;
    }

    
    
