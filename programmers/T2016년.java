package programmers;

public class T2016년 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String answer = "";

        int day = b;
        int[] month = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        for(int i=0; i<a-1; i++) {
            day +=month[i];
        }

        answer = dayOfWeek[day % 7];


        System.out.println(answer);


    }
}
