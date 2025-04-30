import java.util.*;

class RockScissorsPaper {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        while (true) {
            System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
            String input= scan.next();
            int playerChoose = 0;
            int comChoose = ran.nextInt(3);

            System.out.println("입력값 디버깅: [" + input + "]"); // 입력값 디버깅

            switch (input) {
                case "바위" : playerChoose = 0; break;
                case "가위" : playerChoose = 1; break;
                case "보" : playerChoose = 2; break;
                default : System.out.println("다시 입력해 주세요.."); continue;
            }

            if (playerChoose == 0) {
                switch (comChoose) {
                    case 0 : System.out.println("비겼습니다.."); break;
                    case 1 : System.out.println("이겼습니다!!"); break;
                    case 2 : System.out.println("졌네요..."); break;
                }
            } else if (playerChoose == 1) {
                switch (comChoose) {
                    case 0 : System.out.println("졌네요..."); break;
                    case 1 : System.out.println("비겼습니다.."); break;
                    case 2 : System.out.println("이겼습니다!!"); break;
                }
            } else {
                switch (comChoose) {
                    case 0 : System.out.println("이겼습니다!!"); break;
                    case 1 : System.out.println("졌네요..."); break;
                    case 2 : System.out.println("비겼습니다.."); break;
                }
            }
            System.out.println("다시 도전하시겠습니까? (y / n)");
            String retry = scan.next();
            switch (retry) {
                case "y" : continue;
                case "n" : return;
            }
        }
    }
}