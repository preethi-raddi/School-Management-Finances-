package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<teacher> teacherList=new ArrayList<>();
        teacher anna = new teacher(1,"Anna",50000);
        teacher mary = new teacher(2,"Mary",20000);


        student arnav=new student(001, "Arnav", 2);
        student preethi=new student(002, "Preethi", 12);
        student prachi=new student(003, "Prachi", 9);
        List<student> studentList=new ArrayList<>();
        studentList.add(arnav);
        studentList.add(prachi);
        studentList.add(preethi);

        schools cps= new schools(teacherList,studentList);

        arnav.paidFees(25000);
        prachi.paidFees(60000);
        anna.receivedSalary(anna.getSalary());
        System.out.println("Total money earned: "+cps.getTotalMoneyEarned());
    }
}
