import java.util.Scanner;

class factorialCaculator{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("계산할 수를 입력하세요 : ");
        int num = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("결과 : " + factorial);
    }
}