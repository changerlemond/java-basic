package chapter03;

public class _Quiz_03 {

    public static void main(String[] args) {
        String registrationNumber = "901231-1234567";
        System.out.println(registrationNumber.substring(0, 8));
        System.out.println(registrationNumber.substring(0, registrationNumber.indexOf('-') + 2));
    }

}
