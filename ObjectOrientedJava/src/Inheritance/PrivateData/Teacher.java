package Inheritance.PrivateData;

public class Teacher extends Person {
    //getname(),setname(),getage(),setage()

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void display1() {
        display();
        System.out.println(getQualification());
        System.out.println();
    }

}
