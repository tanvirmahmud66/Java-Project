
package Inheritance.PrivateData;

public class Student extends Person{
    //getname(),setname(),getage(),setage()
    private String Batch;

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }
    
    void display2(){
        display();
        System.out.println(getBatch());
        System.out.println();
    }
    
}
