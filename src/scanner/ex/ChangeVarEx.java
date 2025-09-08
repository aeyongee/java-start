package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

//        시작
        temp = b;
        b = a;
        a = temp;
//        종료

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
