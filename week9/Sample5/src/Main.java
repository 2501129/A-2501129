import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int korean, english, math;
        int total;
        float average;
        String result;
        while (true) {
            System.out.println("Enter name and scores.\n" +
                    " Press Ctrl+D or Ctrl+Z to finish input.");
            System.out.print("이릅 입력 : ");
            if (keyboard.nextInt())
                break;

            System.out.print("국어성적입력: ");
            korean= keyboard.nextInt();

            System.out.print("영어성적입력: ");
            english= keyboard.nextInt();

            System.out.print("수학성적입력: ");
            math= keyboard.nextInt();

            total= korean+ english+ math;
            average= total/ 3.0f;
            result= (average>= 70) ? "합격입니다." : "불합격입니다.";

            System.out.println("이름: " + name);
            System.out.println("국어: " + korean);
            System.out.println("영어: " + english);
            System.out.println("수학: " + math);
            System.out.println("TotalScore: " + total);
            System.out.printf("AverageScore: %.2f", average);
            System.out.println(result);
            System.out.println();
        }
        System.out.println("ProgramterminatedduetoEOF.");




        }
}