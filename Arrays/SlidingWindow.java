package arrays;
import java.util.*;
public class SlidingWindow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,windowSize,j=0,k=0,sum=0;
        System.out.print("Ente The Arry Sie:-");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter The Element "+(i+1)+" :-");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter The Window Size:-");
        windowSize=sc.nextInt();
        while(j<windowSize){
            sum+=arr[j];
            j++;
        }
        int max=sum,left=0,right=0;
        for(int i=windowSize;i<n;i++){
            sum=sum+arr[i]-arr[k];
            if(sum>max){
                max=sum;
                right=i;
                left=i-windowSize+1;
            }
            k++;
        }
        System.out.println(max);
        System.out.print(left+" -> "+right);
        sc.close();
    }
}
