import java.util.*;
import java.text.DecimalFormat;

class Ichabang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dot3 = new DecimalFormat("#.###");        // 소수점 3자리까지 반올림해주는 포맷. 5.000같은놈은 5로 출력함
        System.out.println("기본 형식 : ax^2 + bx + c");
        System.out.print("a의 값을 입력하세요. : ");
        int a = scan.nextInt();
        System.out.print("b의 값을 입력하세요. : ");
        int b = scan.nextInt();
        System.out.print("c의 값을 입력하세요. : ");
        int c = scan.nextInt();
        int D = b * b - 4 * a * c;      // 판별식 D
        if (D < 0) {
            double answer1 = (double)-b / (2 * a);
            System.out.println("x = " + dot3.format(answer1) + " + " + dot3.format(Math.sqrt(-D) / 2) + "i");
            double answer2 = (double)-b / (2 * a);
            System.out.println("x = " + dot3.format(answer2) + " - " + dot3.format(Math.sqrt(-D) / 2) + "i");
        } else if (D == 0) {
            double answer1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x = " + dot3.format(answer1));
        } else {
            double answer1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x = " + dot3.format(answer1));
            double answer2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x = " + dot3.format(answer2));
        }
        scan.close();
    }
}