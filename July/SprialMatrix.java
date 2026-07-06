
package July;

import java.util.Scanner;


public class SprialMatrix {
    
    public static void main(String[] args) {
      
        Scanner sc =new Scanner(System.in);
        
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        
        int[][] a = new int[rows][colums];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        int top = 0;
        int bottom = rows-1;
        int left = 0;
        int right = colums-1;
        
        while(top <= bottom && left <= right){
        
         //Left to right
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
              
            }
            top++;
        
            //Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
             
            }
             right--;
            
            //Right to Left
            if(top <= bottom){
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                    
                }
                bottom--;
                
                //Bottom to Top
                if(left <= right){
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(a[i][left] + " ");
                        
                    }
                    left++;
                }
            }
        }
    }
}
