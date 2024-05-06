package Oops;

public class OOPS {
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println("percentage: " + s1.calculatePercentage(24,56,78) + "%");
        s1.studentInfo("Anshika",18);

        pen p1 = new pen();
        p1.setColor("red");
        System.out.println("color: " + p1.color);
        p1.setTip(5);
        System.out.println("tip: " + p1.tip);

        BankAccount myAccount = new BankAccount();
        myAccount.setUsername("KusumNebhwani");
        System.out.println("username: " + myAccount.getUsername());
        myAccount.setPassword("123@kusum");
        System.out.println("password: " + myAccount.getPassword());



    }
}

class BankAccount{
    private String username;
    private String password;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }


}
class pen{
    String color ;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip (int newTip){
        tip = newTip;
    }
}
class student {
    String name;
    int age;
    float percentage;

    float calculatePercentage(int eng,int chem,int maths){
        percentage = (eng + chem + maths)/3;
        return  percentage;

    }
    void studentInfo (String s_name,int s_age){
        name = s_name;
        System.out.println("name: " + name);
        age = s_age;
        System.out.println("age: " + age);
    }

}
