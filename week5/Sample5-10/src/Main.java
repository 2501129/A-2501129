import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int APPLE = 500;
        final  int PEAR = 600;
        int apple, pear;
        int price1,price2;
        int pay;
        String result;

        System.out.printf("사과(%d 원) 구매 개수 립력",APPLE);
        apple = scan.nextInt();
        System.out.printf("배(%d 원) 구매 개수 입력 ",PEAR);
        pear = scan.nextInt();
        System.out.printf("지불 금맥 입력");
        pay = scan.nextInt();

        price1 = apple * APPLE;
        price2 = pear * PEAR;
        result = pay >= price1 + price2 ?
                String.format("거수름 돈 :%,d 원",pay - (price1 + price1
                )) :
                String.format("지불한 금맥이 %,d원 부족합니다.",price1 +price2 -pay);;


        System.out.printf("사과 %d 개의 가격 : %,d 원\n",apple,price1);
        System.out.printf("배 %d개의 가격 : %,d 원 \n",pear,price2);
        System.out.printf("지불 금액 : %,d %원\n",pay);
        System.out.printf(result);
    }
}