package chapter01;

public class _07_TypeCasting {

    public static void main(String[] args) {
        // 형변환 (정수 > 실수, 실수 > 정수)
        int score = (int) (93 + 98.8);
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_float = 93.3F;
        double score_double = 98.8;

        System.out.println((int) score_float);
        System.out.println((double) score_float);

        System.out.println((int) score_double);
        System.out.println((float) score_double);

        // 형변환 (숫자 > 문자)
        String string1 = String.valueOf(93);
        string1 = Integer.toString(93);
        System.out.println(string1);

        String string2 = String.valueOf(98.8);
        string2 = Double.toString(98.8);
        System.out.println(string2);

        // 형변환 (문자 > 숫자)
        int i = Integer.parseInt("83");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);
//        int error = Integer.parseInt("자바");
    }

}
