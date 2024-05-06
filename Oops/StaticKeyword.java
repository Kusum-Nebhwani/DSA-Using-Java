package Oops;

public class StaticKeyword {
    public static void main(String[] args) {

        //1st student
        Student s1 = new Student();
        s1.section = 'A';   //static
        s1.schoolName = "Sunrise Children Academy"; //static
        s1.setNameRollNo("ankit", 23);

        System.out.println("student 1 details");
        System.out.println("name: " + s1.getName());
        System.out.println("roll_no: " + s1.getRollNo());
        System.out.println("section: " + s1.section);
        System.out.println("schoolName: " + s1.schoolName);
        System.out.println("total percentage: " + s1.calculatePercentage(34,89,67) + "%");

        //2nd student
        Student s2 = new Student();
        s2.setNameRollNo("aman", 11);

        System.out.println("student 2 details");
        System.out.println("name: " + s2.getName());
        System.out.println("roll_no: " + s2.getRollNo());
        System.out.println("section: " + s2.section);
        System.out.println("schoolName: " + s2.schoolName);
        System.out.println("total percentage: " + s2.calculatePercentage(54,66,57) + "%");



    }
}

class Student{
   static char section;
   static String schoolName;


   static int calculatePercentage(int english,int hindi,int maths){
       return (maths + english + hindi) / 3;
   }

    String name;
    int rollNo;



    void setNameRollNo(String name,int rollNo){
        this.name = name;
       this.rollNo = rollNo;
    }

   String getName(){
        return this.name;

    }
    int getRollNo(){
        return this.rollNo;
    }
}
