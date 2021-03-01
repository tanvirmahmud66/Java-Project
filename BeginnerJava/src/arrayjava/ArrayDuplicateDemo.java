
package arrayjava;

public class ArrayDuplicateDemo {
    public static void main(String[] args) {
        
        int a[] = {1,2,2,3,4,4,5,6,7,5};
        
        //display array value
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        //display duplicate value
        System.out.print("Duplicate values are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }
        System.out.println();
        
        
    }
    
}
