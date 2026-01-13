import java.util.ArrayList;

class StudentService {

    ArrayList<Student> list = new ArrayList<>();

    void addStudent(Student s) {
        list.add(s);
        System.out.println("Student Added Successfully!");
    }

    void removeStudent(int id) {
        for (Student s : list) {
            if (s.id == id) {
                list.remove(s);
                System.out.println("Student Removed Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    void showStudents() {
        if (list.isEmpty()) {
            System.out.println("No Students Available!");
            return;
        }
        for (Student s : list) {
            System.out.println(s.id + " - " + s.name + " - " + s.age);
        }
    }
}
