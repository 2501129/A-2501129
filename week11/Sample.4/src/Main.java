//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int[][][] dealer = new int[2][4][6];
        String[] item = {"TV", "냉장고"};
        dealer = new int[][][]{{{9, 7, 4, 3, 2, 0},
                {5, 6, 7, 8, 7, 0},
                {14, 21, 7, 6, 9, 0},
                {0, 0, 0, 0, 0, 0}},
                {{8, 9, 6, 7, 8, 0},
                        {12, 14, 8, 9, 12, 0},
                        {20, 16, 12, 11, 18, 0},
                        {0, 0, 0, 0, 0, 0}}};

        for (int i = 0; i < dealer.length; i++) {
            for (int j = 0; j < dealer[i].length; j++) {
                for (int k = 0; k < dealer[i][j].length - 1; k++) {
                    dealer[i][j][dealer[i][j].length - 1] += dealer[i][j][k];
                }
            }
        }
        for (int i = 0; i < dealer.length; i++) {
            for (int j = 0; j < dealer[i].length - 1; j++) {
                for (int k = 0; k < dealer[i][j].length; k++) {
                    dealer[i][dealer[i].length - 1][k] += dealer[i][j][k];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < dealer.length; i++) {
            sum += dealer[i][dealer[i].length - 1]
                    [dealer[i][dealer[i].length - 1].length - 1];
        }

        System.out.println("\t 전자회사 매출 집계표");
        for (int i = 0; i < dealer.length; i++) {
            System.out.printf("\t\t\t\t\t 품목 : %s\n", item[i]);
            System.out.println("*************************************");
            System.out.println("   서울 부산 대구 인천 광주 총합 ");
            System.out.println("*************************************");
            for (int j = 0; j < dealer[i].length; j++) {
                for (int k = 0; k < dealer[i][j].length; k++) {
                    System.out.printf(" %4d", dealer[i][j][k]);
                }
                System.out.println();
            }
            System.out.println("*************************************");
            System.out.printf("\t\t\t %s 매출총액 : %,d 천만원\n\n",
                    item[i], dealer[i][3][5]);
        }
        System.out.printf("\t\t 매출 총액 : %,d 천만원\n", sum);


    }
}