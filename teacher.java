package schoolManagementSystem;

/*
    This class is responsible for keeping track of the id, name and the salary of the teachers
 */
public class teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /* constructor: special function used to create a new object
     * role:
     *   - to create a new teacher object by initializing objects
     *   - id: is going to be unique (not going to alter it)
     *   - name: may or may not be unique (not going to alter it)
     *   - salary: is unique, it varies wrt to the seniority */

    public teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
// return the id of the teacher.
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    // set the salary of the teacher
    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receivedSalary(int salary){
        salaryEarned+=salary;
        schools.updateTotalMoneySpent(salaryEarned);
    }

}
