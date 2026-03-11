package BasicMath;
import java.util.*;
public class Armstrong {
    public static void main(String[] argss){
        Scanner sc=new Scanner(System.in);
        int n,nCopy,digits=0,rem,sum=0;
        System.out.print("Enter The Number:-");
        n=sc.nextInt();
        nCopy=n;
        while(n>0){
            digits++;
            n/=10;
        }
        n=nCopy;
        while(n>0){
            rem=n%10;
            sum+=Math.pow(rem,digits);
            n/=10;
        }
        if(nCopy==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
        sc.close();
    }
}
