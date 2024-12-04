package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_11047 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) {
            st = new StringTokenizer(br.readLine());
            arr[i-1] = Integer.parseInt(st.nextToken());
        }
        int 동전수 = 0;
        for(int a : arr) {
            if (a <= k) {
                동전수 += k / a;
                k = k % a;
            }
        }
        System.out.println("동전수 = " + 동전수);
    }
}
