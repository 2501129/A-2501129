import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary,expenses;   //Data
        float saveRate;   //Data
        int save, remain, money;   //정보



        System.out.printf("월급을입력하세요(원):");
        salary = keyboard.nextInt();
        System.out.printf("저축비율을입력하세요(예: 0.2은20%):");
        salary = keyboard.nextInt();
        System.out.printf("월지출총액을입력하세요(원):");
        salary = keyboard.nextInt();

        save = (int) (salary * saveRate);
        remain = salary - (save + saveRate);
        money = remain / 30;


        System.out.printf("[예산계산결과]");
        System.out.printf("월급: %,d원\n",salary);
        System.out.printf("저축액: %,d원\n",save);
        System.out.printf("지출액: %,d 원\n",expenses);
        System.out.printf("남은금액: %,d 원\n",remain);
        System.out.printf("일일사용가능예산: %,d 원\n",money);

    }
}