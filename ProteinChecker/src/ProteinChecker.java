import java.util.Scanner;

public class ProteinChecker {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Calculator a = new Calculator();
        Foods food = new Foods();
        String foodinput;
        String cinput;
        double protein = 0;
        
        System.out.println("ProteinChecker을 사용해주셔서 감사합니다!");
        try {
          while(true){
            System.out.print("음식 이름 입력(추가기능 - 목록 / 계산기 / 종료 ) : ");//안내 문구
            
            foodinput = scan.nextLine();//음식이름, 추가기능 입력

            if(foodinput.equals("종료")) break; //프로그램 종료 트리거

            else if(foodinput.equals("목록")) { //전체 음식 목록 출력
                food.printall();
                continue;
            }
            else if(foodinput.equals("계산기")) { //계산기 기능 수행 시작
                System.out.println("계산기 기능 수행 시작");
                System.out.println("종료 - '종료' / 내역 삭제 - 'c' / 이전 값으로 - 'b'");//안내 문구
                System.out.println("--------------------------------");
                cinput = scan.nextLine();
                a.push(Double.parseDouble(cinput)); //처음 입력받은 값 a의 history의 top에 저장
                while(true) {
                    cinput = scan.nextLine();//연산부호 입력
                    
                    if(cinput.equals("종료")) break;  //계산기 기능 종료 트리거
                    else if(cinput.equals("c")) { //내역 삭제 트리거
                        a.clear();
                        cinput = scan.nextLine();
                        a.push(Double.parseDouble(cinput)); //내역 삭제 후 기본 과정 진행
                        continue;
                    }
                    else if(cinput.equals("b")) { //이전 값으로 트리거
                        a.pop();
                        a.show(); //이전 값 출력
                        continue;
                    }

                    switch(cinput) {
                    case "+" : cinput = scan.nextLine();//계산할 값 입력
                        a.sum(Double.parseDouble(cinput));
                        break;
                    case "-" : cinput = scan.nextLine();//계산할 값 입력
                        a.sub(Double.parseDouble(cinput));
                        break;
                    case "*" : cinput = scan.nextLine();//계산할 값 입력
                        a.mul(Double.parseDouble(cinput));
                        break;
                    case "/" : cinput = scan.nextLine();//계산할 값 입력
                        a.div(Double.parseDouble(cinput));
                        break;
                    }

                    a.show();//계산결과 출력
                }
                System.out.println("계산기 종료.");
                continue;//계산기 기능 종료
            }
            
            if(food.getprotein(foodinput) == null) {//데이터에 존재하지 않는 음식을 찾을 때 예외 처리
                System.out.println("존재하지 않는 데이터입니다.");
                continue;
            }
            protein = food.getprotein(foodinput);
            System.out.printf("%s : %.2fg (100g 당)\n", foodinput, food.getprotein(foodinput));//입력받은 음식 단백질 g수 출력
            //반복
         }
        }catch(Exception e) {
        System.out.println("오류 발생");
        e.printStackTrace();
        }//전체적 예외 처리
        
        scan.close();//스캐너 닫음
        System.out.println("프로그램을 종료합니다.");
        //프로그램 종료
    }
}
