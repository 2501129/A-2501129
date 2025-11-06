import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int count = 0;
        int total = 0;

        while (true){
            System.out.println(" 양의 정수 입력 : ");
            num = keyboard.nextInt();
            if (num > 0)
                break;
            else {
                System.out.print("ERROR : 양의 정수");
                System.in.read();
            }
        }
        System.out.printf("입력한정수는%,d입니다.", num);

        while(num!= 0) {
            count++;
            total += num% 10;
            num/= 10;
        }

        System.out.printf("\n숫자의개수는%d개입니다.", count);
        System.out.printf("\n숫자의합은%d입니다.\n", total);

    }
}