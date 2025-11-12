import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "김대한", "한민국", "나이쁨", "이기쁨",
                "이자바", "나뚱뚱", "정문제", "김민주", "노재팬"};
        float[] weight = new float[name.length];
        float max = 30.0f;
        String maxname = "";
        float min = 120.0f;
        String minname = "";
        int i = 0;
        while (i < weight.length) {
            System.out.printf("(%d/%d) %s님의 몸무게 입력 : ", i + 1,
                    weight.length, name[i]);
            weight[i] = keyboard.nextFloat();
            if (weight[i] >= max && weight[i] <= min)
                i++;
            else
                System.out.println("ERROR");
        }
        for (i = 0; i < weight.length; i++) {
            if (max < weight[i]) {
                max = weight[i];
                maxname = name[i];
            }
        }
        for (i = 0; i < weight.length; i++) {
            if (min > weight[i]) {
                min = weight[i];
                minname = name[i];
            }
        }
        for (i = 0; i <weight.length; i++)
            System.out.printf(" %s님몸무게: %.1f\n", name[i], weight[i]);
        System.out.printf(" 가장가벼운%s님몸무게: %.1f\n",
                minname, min);
        System.out.printf(" 가장무거운%s님몸무게: %.1f\n",
                maxname, max);

}
}