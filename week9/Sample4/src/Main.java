//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
       for (int i = 1; i <= 3; i++) {
           System.out.println("%d Set\n",i);
       }
       /* for (int i = 1; i <= 20; i++) {
            System.out.println("\t 팔굽히피기 : %d 회\n",i);
        } */

      /*itn i = 1;
        while (i <= 20) {
            System.out.println("\\t 팔굽히피기 : %d 회\n",i++);
        }*/

        int i = 1;
        do {
            System.out.println("\\t 팔굽히피기 : %d 회\\n",i++);

        }

    }
}