package Training;
import java.util.*;
public class BiggestOfTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int biggestOfTwo=(a>b)?a:b;
        System.out.println(biggestOfTwo);
        sc.close();
    }
}
