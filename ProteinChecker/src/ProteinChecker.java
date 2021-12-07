import java.util.Scanner;

public class ProteinChecker {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Calculator a = new Calculator();
        Foods food = new Foods();
        String foodinput;
        
        System.out.println("ProteinChecker을 사용해주셔서 감사합니다!\n");
        
        while(true){
            System.out.println("100g 당 단백질 g수를 알고 싶은 음식의 이름 입력 : ");
            foodinput = scan.nextLine();
        }
    }
}
