//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        String[][] person= {{"12345", "홍길동"}, {"34563", "이혜인"},
                {"45321", "김명성"}, {"56456", "경복대"}, {"67853", "이대학"}};
        int[][] score= {{90, 90, 95, 0}, {87, 88, 90, 0},
                {75, 100, 95, 0}, {100, 100, 99, 0}, {100, 75, 89, 0}};
        float[] avg = new float[person.length];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length- 1; j++) {
                score[i][score[i].length- 1] += score[i][j];
            }
        }
        for (int i = 0; i < avg.length; i++) {
            avg[i] = score[i][3] / 3.0f;
        }
        System.out.println("_______________________________________________");
        System.out.println("   학번 이름 국어 영어 수학 총점 평균");
        System.out.println("_______________________________________________");
        for (int i = 0; i < score.length; i++) {
            System.out.printf(" %5s %5s %5d %5d %5d %5d %6.2f\n", person[i][0],
                    person[i][1], score[i][0], score[i][1], score[i][2], score[i][3], avg[i]);
        }
        System.out.println("_______________________________________________");



    }
}