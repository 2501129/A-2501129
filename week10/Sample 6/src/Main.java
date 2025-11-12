import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] hakbun = {"1601003", "1601007", "1601013",
                "1601024", "1601026", "1601058", "1601077",
                "1601085", "1601096", "1601110"};
        String[] name = {"홍길동", "이대한", "한나라",
                "이순신", "김동근", "김현호", "이동국",
                "박예림", "김혜숙", "나희영"};
        String s_temp;

        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] sum = new int[name.length];

        int test;
        float[] avg = new float[name.length];
        int[] rank = new int[name.length];
        float f_temp;

        int i, j;
        String[] hakjum = new String[name.length];
        char[] score = new char[name.length];
        char[] grade = new char[name.length];
        char[] plus = new char[name.length];

        i = 0;
        while (i < name.length) {
            System.out.printf("%d 번째 %s님의 국어 성적 : ", i + 1, name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("%d 번째 %s님의 영어 성적 : ", i + 1, name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("%d 번째 %s님의 수학 성적 : ", i + 1, name[i]);
            math[i] = keyboard.nextInt();
            if ((kor[i] >= 0 && kor[i] <= 100) &&
                    (eng[i] >= 0 && eng[i] <= 100) &&
                    (math[i] >= 0 && math[i] <= 100)) {
                System.out.println();
                i++;
            } else {
                System.out.print(" ERROR 성적은 0점에서 100점사이의 값");
                System.in.read();
            }
        }
    }
}