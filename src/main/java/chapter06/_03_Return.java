package chapter06;

public class _03_Return {

    public static String getPhoneNumber() {
        return "02-1234-5678";
    }

    public static String getAddress() {
        return "서울시 어딘가";
    }

    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        String phoneNumber = getPhoneNumber();
        System.out.printf("호텔 전화번호: %s %n", phoneNumber);

        String address = getAddress();
        System.out.printf("호텔 주소: %s %n", address);

        System.out.println("호텔 액티비티: " + getActivities());
    }

}
