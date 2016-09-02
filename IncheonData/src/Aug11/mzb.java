package Aug11;
import java.util.*;
 
public class mzb {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String input = "";
 
        while(true) {
            System.out.print("입력 (종료는 q, 가위는 0, 바위는 1, 보는 2) : ");
            input = scan.nextLine();
            if(input.equals("q")) break;
 
            int user = Integer.parseInt(input);
            int com = random.nextInt() % 3;
 
            if(user < 0 || user > 2) {
                System.out.println();
                continue;
            }
 
            if(user < 0) user = user * -1;
            if(com < 0) com = com * -1;
 
            LinkedHashMap table = new LinkedHashMap();
            table.put("0", "가위");
            table.put("1", "바위");
            table.put("2", "보");
 
            Object value1 = table.get(String.valueOf(user));
            System.out.println("당신은 " + value1 + "를 냈습니다.");
 
            Object value2 = table.get(String.valueOf(com));
            System.out.println("컴퓨터는 " + value2 + "를 냈습니다.");
 
            System.out.println("---------------------------");
            System.out.print("게임 결과 : ");
 
            if(user == com) System.out.println("비겼습니다.");
            else if(user == (com+1) % 3) System.out.println("당신이 이겼습니다.");
            else System.out.println("컴퓨터가 이겼습니다.");
 
            System.out.println("============================");
            System.out.println();
        }
        System.out.println("게임종료");
 
    }
 
}