package problems;
import java.util.*;

public class NumberSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<Integer> nums = new TreeSet<>();        // HashSet처럼 중복 자동 제거지만 정렬까지 자동으로 해줌
        while (true) {
            int input = scan.nextInt();
            if (input == 0) {
                for (int i : nums) {
                    System.out.print(i + " ");
                }
                break;
            }
            nums.add(input);
        }
        scan.close();
    }
}
