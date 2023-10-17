class Solution {
    public static List<String> fizzBuzz(int n) {
        String[] answer1 = new String[n + 1];
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3  == 0 && i % 5 == 0)  {
                answer1[i] = "FizzBuzz";
                continue;
            }
            if (i % 3  == 0) {
                answer1[i] = "Fizz";
                continue;
            }
            if (i % 5 == 0) {
                answer1[i] = "Buzz";
                continue;
            }
            answer1[i] = i + "";
   
        }

        for (int i = 1; i <= n; i++) {
            answer.add(answer1[i]);
        }
        return answer;
    }
}