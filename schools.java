package schoolManagementSystem;

import java.util.List;

/* school can have many teachers and students
        inmpliments teachers and studetns using arrayList because we dont have a fixed number of teachers and students.
 */
public class schools {
    private List<teacher> teachers;
    private List<student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public schools(List<teacher> teachers, List<student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
    // return the llist of teachers in the school
    public List<teacher> getTeachers() {
        return teachers;
    }
    // return the list of the students in the school
    public List<student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // add the new teachers to the school
    public void addTeacher(teacher Teacher){
        teachers.add(Teacher);
    }

    // add the new students to the school
    public void addStudents(student Student) {
        students.add(Student);
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned =  totalMoneyEarned + MoneyEarned;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
