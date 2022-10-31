package zerobase.weather;
import zerobase.weather.domain.aa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
//        int sc1 = sc.nextInt();
//        int[] arr1 = new int[sc1];
//        for (int i = 0; i < sc1; i++) {
//            arr1[i] = Integer.parseInt(sc.next());
//        }
        int sc2 = sc.nextInt();
        System.out.println();
        int solution = Main.solution(sc2);
        System.out.println(solution);
    }

    public static int solution(int sc2) {

        int sum = 0;
        int cnt = 0;
        int idx1 = 1; //변화하는 수
        int idx2 = 1; //고정수

        while(idx2 < sc2) {

            sum += idx1;

            if(sum == sc2) {
                cnt++;
                sum = 0;
                idx1++;

            } else if(sum> sc2) {
                sum=0;
                idx2++;
                idx1 = idx2;
            }
            idx1 ++;
        }
        return cnt;





    }
}

