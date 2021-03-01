
package basicjava;

import java.util.Scanner;


public class ForLoopDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Say hi!");
        }
        System.out.println("-------------");
        
        for(int j=0;j<10;j+=2){
            System.out.println(j);
        }
        System.out.println("-------------");
        
        for(int k=10;k>0;k-=2){
            System.out.println(k);
        }
        System.out.println("--------------");
       
        
        //Even number
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        for(int l=0;l<n;l+=2){
            System.out.println(l);
        }
        
    }
    
}
