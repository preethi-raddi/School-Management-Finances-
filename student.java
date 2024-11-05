package schoolManagementSystem;

/* this class is responsible ot keeping a track of the id, name, fees given, and total fees */

public class student {
    private int id;// "private" access specifier to prevent external usage of the data
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /* constructor: special function used to create a new object
    * role:
    *   - to create a new student object by initializing objects
    *   - id: is going to be unique (not going to alter it)
    *   - name: may or may not be unique (not going to alter it)
    *   - grade: the grade of the student
    *   - fees for every student is going to be 30,000
    *   - fees paid initially will be zero*/

    public student(int id, String name, int grade){
        feesPaid=0; // "this" keyword is not used because there is no attributed passed. Hence, no ambiguity.
        feesTotal=30000;
        this.id = id;
        this.name=name;
        /*The "this" keyword refers to the current object in a method or constructor. The most
        common use of the "this" keyword is to eliminate the confusion between class attributes and
        parameters with the same name (because a class attribute is shadowed by a method or
        constructor parameter
         */
        this.grade = grade;


    }
    //updating the grade of the student
    // @param grade is the new grade of the student
    public void setGrade(int grade){
        this.grade=grade;
    }

    /*
    Add the fees to the fees paid
    The school is going to receive the funds
     */
    public void paidFees(int fees){
        this.feesPaid=this.feesPaid+fees;
        schools.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    public int getId(){
        return id;
    }

    public int getGrade(){
        return grade;
    }

    public int getFeesPaid(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return feesTotal;
    }

    public String getName(){
        return name;
    }

}
