package programmers;

public class 신규아이디추천 {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String answer = new_id.toLowerCase();

        answer = answer.replaceAll("[^0-9a-z._-]","");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");

        answer = answer.isEmpty() ? "a" : answer;

        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if(answer.endsWith(".")) {
                answer = answer.substring(0, 14);
            }
        }

        if(answer.length() <=2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        System.out.println(answer);

    }
}
