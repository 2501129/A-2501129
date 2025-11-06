import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int LAST = 101;
        int sum = 0;
        if (LAST % 2 == 0) {
            int temp = 1 + LAST;
            sum = temp * (LAST / 2);
        } else {
            int temp = 1 + LAST;
            sum = temp * (LAST / 2);
            sum += (LAST / 2 + 1);
        }
        System.out.printf("1부터 %d까지의 합 : %,d\n", LAST, sum);
    }
}
