import java.util.*;
import java.text.DecimalFormat;

public class StatisticsCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        DecimalFormat dot3 = new DecimalFormat("#.###");
        do {
            System.out.print("수 입력 (종료하려면 -1 입력) : ");
            int a = scan.nextInt();
            if (a == -1) break;
            arr.add(a);
        } while (true);
        if (arr.isEmpty()) {
            System.out.println("입력값이 없습니다.");
            scan.close();
            return;
        }
        int nums[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }
        Arrays.sort(nums);
        double ave = getAve(nums);
        feedLine();
        System.out.println("산술평균 : " + dot3.format(ave));
        System.out.println("중앙값 : " + dot3.format(getMiddleValue(nums)));
        System.out.println("분산 : " + dot3.format(getBunsan(nums, ave)));      // 표본분산이여서 입력값 2개 이상일때만 유의미
        System.out.println("표준편차 : " + dot3.format(Math.sqrt(getBunsan(nums, ave))));
        scan.close();
    }
    static void feedLine() {
        for (int i = 1; i <= 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    static double getAve (int a[]) {
        double sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum / a.length;
    }
    static double getMiddleValue(int a[]) {
        if (a.length % 2 == 1) {
            return a[a.length / 2];
        } else {
            return (double)(a[a.length / 2 - 1] + a[a.length / 2]) / 2;
        }
    }
    static double getBunsan (int a[], double b) {
        if (a.length == 1) return 0;
        double sum = 0;
        for (int i : a) {
            sum += Math.pow(b - i, 2);
        }
        return sum / (a.length - 1);
    }
}