import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int data = 0;
        String result = "";     // 음수, 영, 양수

        System.out.print("점수 입력 : ");
        data = kb.nextInt();

        result = data > 0 ? "양수" : (data == 0 ? "영" : "음수");

        System.out.printf("입력한 숫자 %d는 %s 입니다.\n", data, result);
    }
}