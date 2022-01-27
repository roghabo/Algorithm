package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 예산 {
    public static void main(String[] args) {
        int[] d = new int[]{1,3,2,5,4};
        int budget = 9;
        int answer = 0;

        List<Integer> list = Arrays.stream(d).boxed().collect(Collectors.toList());
        Collections.sort(list);

        int sum = 0;
        for(Integer num: list) {
            sum += num;
            if(sum <= budget) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
