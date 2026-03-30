package training;

import java.util.Queue;
import java.util.LinkedList;

public class NthPerfectNumber {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<Integer>();
        int n = 6, a, b, ele;
        qu.offer(1);
        qu.offer(2);
        for (int i = 1; i < n; i++) {
            ele = qu.poll();
            a = ele * 10 + 1;
            b = ele * 10 + 2;
            qu.offer(a);
            qu.offer(b);
        }
        System.out.println(qu.peek());
    }
}
