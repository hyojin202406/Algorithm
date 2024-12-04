package 그리디;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        int data1 = 0;
        int data2 = 0;
        int sum = 0;
        while (pq.size() != 1) {
            data1 = pq.remove();
            data2 = pq.remove();
            int data = data1 + data2;
            sum += data;
            pq.add(data);
        }
        System.out.println(sum);
    }
}
