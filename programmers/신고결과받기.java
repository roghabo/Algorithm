package programmers;

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] answer = {};

        HashMap<String, Set<String>> member = new HashMap<>();
        HashMap<String, Integer> reportedMember = new HashMap<>();

        for(int i=0; i<id_list.length; i++) {
            member.put(id_list[i], new HashSet<>());
            reportedMember.put(id_list[i], 0);
        }

        for(int i=0; i<report.length; i++) {
            String[] reportMember = report[i].split("");
            member.get(reportMember[0]).add(reportMember[1]);
            int num = reportedMember.get(reportMember[0]);
            reportedMember.put(reportMember[0], ++num);
        }

        for(String key: reportedMember.keySet()) {
            int count = reportedMember.get(key);
            if(count >= k) {

            }
        }



        for(int i=0; i< answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
