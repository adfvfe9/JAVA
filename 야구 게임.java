import java.util.Scanner;
import java.util.Random;

class NumberBaseball {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        int[] ranNum = new int[] {-1, -1, -1};
        int rand;
        for (int i = 0; i < ranNum.length;) {
            rand = ran.nextInt(10);
            if (i == 0 && rand == 0) {
                continue;
            }
            boolean dup = false;
            for (int j = 0; j < i; j++) {
                if (ranNum[j] == rand) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                ranNum[i] = rand;
                i++;
            }
        }
        int random = ranNum[0] * 100 + ranNum[1] * 10 + ranNum[2];
        //System.out.println("디버깅용 정답: " + random);

        while (true) {
            int out = 0;
            int ball = 0;
            int strike = 0;
            System.out.print("1 ~ 999 사이의 수를 입력하세요 : ");
            int num = scan.nextInt();

            if (num == random) {
                System.out.println("홈런!");
                break;
            } else {
                if (num / 100 == random / 100) {
                    strike++;
                } else if (num / 100 == random / 10 % 10 || num / 100 == random % 10) {
                    ball++;
                } else {
                    out++;
                }
                if (num / 10 % 10 == random / 10 % 10) {
                    strike++;
                } else if (num / 10 % 10 == random / 100 || num / 10 % 10 == random % 10) {
                    ball++;
                } else {
                    out++;
                }
                if (num % 10 == random % 10) {
                    strike++;
                } else if (num % 10 == random / 100 || num % 10 == random / 10 % 10) {
                    ball++;
                } else {
                    out++;
                }
                System.out.println(out + " 아웃, " + ball + " 볼, " + strike + " 스트라이크");
            }
        }
    }
}