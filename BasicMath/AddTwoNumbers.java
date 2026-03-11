package BasicMath;
import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter The 1st Number:-");
        num1=sc.nextInt();
        System.out.print("Enter The 2nd Number:-");
        num2=sc.nextInt();
        System.out.println("The Sum of Two Numbers Is:-"+(num1+num2));
        sc.close();
    }
}
