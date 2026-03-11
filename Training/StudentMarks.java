package training;

import java.util.*;

public class StudentMarks {
    int total, avg;

    public void calcTotal(int a, int b, int c, int d, int e) {
        total = a + b + c + d + e;
        System.out.println("Your Total Mark's IS:-" + total);
    }

    public void calcAverage() {
        avg = total / 5;
        System.out.println("Your Average Mark's IS:-" + avg);
    }

    public void getResult() {

    }

    public static void main(String[] args) {
        StudentMarks std = new StudentMarks();
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.print("Enter Your Telugu Marks:-");
        a = sc.nextInt();
        System.out.print("Enter Your English Marks:-");
        b = sc.nextInt();
        System.out.print("Enter Your Maths Marks:-");
        c = sc.nextInt();
        System.out.print("Enter Your Science Marks:-");
        d = sc.nextInt();
        System.out.print("Enter Your Social Marks:-");
        e = sc.nextInt();
        std.calcTotal(a, b, c, d, e);
        std.calcAverage();
        System.out.println();
        sc.close();
    }
}