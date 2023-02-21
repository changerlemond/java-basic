package chapter01;

public class _03_Variables {

    public static void main(String[] args) {
        String name = "클레어";
        int hour = 5;

        double score = 90.5;
        char grade = 'A';
        boolean pass = true;

        double number1 = 3.14123456789;
        float number2 = 3.14123456789F;

        name = "죠르디";
        long number3 = 10_000_000_000L;

        System.out.printf("%s님 배송이 시작됩니다. %d시에 방문 예정입니다!%n", name, hour);
        System.out.println(name + "님 배송이 완료되었습니다.");
        System.out.printf("%s님의 평균 점수는 %f점입니다.%n", name, score);
        System.out.printf("학점은 %c입니다.%n", grade);
        System.out.printf("이번 시험에 합격했을까요? %b %n", pass);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }

}
