package Training;
import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter The Number:-");
        num=sc.nextInt();
        if((num&1)==1) System.out.println("Odd Number");
        else System.out.println("Even Number");
        sc.close();
    }
} 