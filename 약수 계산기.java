import java.util.ArrayList;
import java.util.Scanner;

class MeasureCaculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        ArrayList<Integer> measures = new ArrayList<>();

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    measures.add(i);
                }
            }
        } else {
            for (int i = 1; i <= -num; i++) {
                if (num % i == 0) {
                    measures.add(-i);
                    measures.add(i);
                }
            }
        }
        System.out.println(num + "의 약수 : " + measures);

        scan.close();
    }
}