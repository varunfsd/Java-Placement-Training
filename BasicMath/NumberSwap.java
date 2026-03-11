package BasicMath;
import java.util.*;
public class NumberSwap {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    System.out.print("Enter The 1st Number:-");
    num1=sc.nextInt();
    System.out.print("Enter The 2nd Number:-");
    num2=sc.nextInt();
    int temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("After Swap The 1st Number Is:-"+num1);
    System.out.println("After Swap The 2nd Number Is:-"+num2);
    sc.close();
  }  
}
