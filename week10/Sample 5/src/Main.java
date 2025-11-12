import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        float[] movie = new float[10];
        final float MIN = 1.0f;
        final float MAX = 10.0f;
        float total = 0.0f, avg;

        int i = 0;
        while  (i < movie.length) {
            System.out.printf("%d번 고객의 명점 입력",i + 1);
            movie[i] = keyboard.nextFloat();

            if (movie[i] >= MIN && movie[i] <= MAX)
                i++;
            else {
                System.err.printf("ERROR: %.1f ~ %.1f",MIN, MAX);
                System.in.read();

            }
        }
        for (i = 0; i < movie.length; i++)
            total += movie[i];

        avg = total / movie.length;

        for (i = 0; i < movie.length; i++) {

        }

        System.out.printf("편균 점수 : %3.1f 점\n",avg);
        System.out.printf("만잠자 수 : %d 명\n",MAX);
        System.out.printf("%.0f점 이하자 수 : %d 명\n",MIN);
    }
}