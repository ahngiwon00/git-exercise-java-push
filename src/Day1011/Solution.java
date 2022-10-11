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
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        solution.solution(n);

    }
}
