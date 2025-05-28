import java.util.*;

class TickTackToe {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        char[][] ground = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        int garo = 0, sero = 0;
        boolean isO = true;

        while (true) {
            System.out.print("1 ~ 9 사이의 칸 입력 : ");
            int pC = scan.nextInt();

            switch (pC) {
                case 1 : garo = 0; sero = 0; break;
                case 2 : garo = 1; sero = 0; break;
                case 3 : garo = 2; sero = 0; break;
                case 4 : garo = 0; sero = 1; break;
                case 5 : garo = 1; sero = 1; break;
                case 6 : garo = 2; sero = 1; break;
                case 7 : garo = 0; sero = 2; break;
                case 8 : garo = 1; sero = 2; break;
                case 9 : garo = 2; sero = 2; break;
                default : continue;
            }

            if (ground[sero][garo] == ' ') {
                if (isO) {
                    ground[sero][garo] = 'O';
                } else {
                    ground[sero][garo] = 'X';
                }
            } else {
                System.out.println("해당 칸은 이미 사용되었습니다.");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(ground[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < 3; i++) {
                if (ground[0][i] == ground[1][i] && ground[1][i] == ground[2][i] && ground[0][i] != ' '){
                    if (isO) {
                        System.out.print("O");
                    } else {
                        System.out.print("X");
                    }
                    System.out.println(" 승리!");
                    return;
                }
                if (ground[i][0] == ground[i][1] && ground[i][1] == ground[i][2] && ground[i][0] != ' '){
                    if (isO) {
                        System.out.print("O");
                    } else {
                        System.out.print("X");
                    }
                    System.out.println(" 승리!");
                    return;
                }
            }
            if (ground[0][0] == ground [1][1] && ground[1][1] == ground[2][2] && ground[0][0] != ' ') {
                if (isO) {
                        System.out.print("O");
                    } else {
                        System.out.print("X");
                    }
                    System.out.println(" 승리!");
                    return;
            } else if (ground[2][0] == ground [1][1] && ground[1][1] == ground[0][2] && ground[2][0] != ' ') {
                if (isO) {
                        System.out.print("O");
                    } else {
                        System.out.print("X");
                    }
                System.out.println(" 승리!");
                return;
            }
            isO = !isO;
        }
    }
}