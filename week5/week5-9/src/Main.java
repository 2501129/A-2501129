import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        float height;
        char gender;
        float weight;
        String result;

        System.out.print("당신의 성별(남 =M, 여 = F) 입력 :");
        gender = kb.next().charAt(0);
        System.out.print("당신의 키는(단위 : Meter) 입력 : ");
        height = kb.nextFloat();

        if (gender == 'M' || gender == 'm') {
            weight = height * height * 22;
            result = String.format("키가 %.2f Meter인 남자의 표준 체중은 %.2f Kg 입니다.\n", height, weight);
        } else {
            weight = height * height * 21;
            result = String.format("키가 %.2f Meter인 여자의 표준 체중은 %.2f Kg 입니다.\n", height, weight);
        }

        System.out.println(result);
    }
}