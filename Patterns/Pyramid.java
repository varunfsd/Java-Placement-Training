package Patterns;
import java.util.*;
public class Pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter The Pyramid Height:-");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
