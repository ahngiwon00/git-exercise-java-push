package Day1011;

import java.util.Scanner;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while (true){
            answer = n % 10 + answer;
            n=n/10;
            if(n==0)
                break;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result1 = solution.solution(1234);
        if(result1 ==10){
            System.out.println("테스트통과");
        }
        else{
            System.out.println("테스트 실패 result:"+result1);
        }


    }
}
