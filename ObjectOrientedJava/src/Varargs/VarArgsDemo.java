package Varargs;

public class VarArgsDemo {

    //variable arguments lenth, we can take variable number in peremeter
    void add(int ... num) {
        int sum = 0;
        
        //for each loop
        for (int x : num) {
            sum += x;
        }
        System.out.println(sum);
    }

    
    
    public static void main(String[] args) {

        VarArgsDemo ob = new VarArgsDemo();
        ob.add(10, 20, 30, 40, 50);
    }

}
