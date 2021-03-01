
package Problem_Solving;

public class ThisKeyWord {

    double height, width, depth;//instance variable

    ThisKeyWord(double height, double width, double depth)//local variable
    {
        //variable hiding
        //when instance varable and local variable are same than we have to use this keyword for variable hiding
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol() {
        double vol = height * width * depth;
        System.out.println("Box Volume: " + vol);
    }

    
    
    public static void main(String[] args) {

        ThisKeyWord box1 = new ThisKeyWord(10, 10, 10);
        ThisKeyWord box2 = new ThisKeyWord(20, 30, 10);

        box1.displayVol();
        box2.displayVol();

    }
    
}
