package Problem_Solving;

public class Box {

    double height, width, depth;

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void displayVol() {
        double vol = height * width * depth;
        System.out.println("Box Volume: " + vol);
    }

    
    
    public static void main(String[] args) {

        Box box1 = new Box(10, 10, 10);
        Box box2 = new Box(20, 30, 10);

        box1.displayVol();
        box2.displayVol();

    }

}
