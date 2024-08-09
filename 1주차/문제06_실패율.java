package study2;

import java.util.HashMap;

public class 문제06_실패율 {
    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        // 스테이지별 도전자 구하기
        int[] challenger = new int[n + 2];
        for (int i = 0; i < stages.length; i++) {
            int stage = stages[i];
            challenger[stage]++;
        }

        // 스테이지별 실패한 사용자 수 계산
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;
        for (int i = 1; i <= n; i++) {
            if (challenger[i] == 0) {
                fails.put(i, 0.);
            } else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }

        int[] ints = fails.entrySet().stream()
                .sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(HashMap.Entry::getKey).toArray();

    }
}
