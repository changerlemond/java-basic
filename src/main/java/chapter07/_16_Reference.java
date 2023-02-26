package chapter07;

import chapter07.camera.Camera;

public class _16_Reference {

    public static void main(String[] args) {
        // 기본 자료형(소문자로 시작, 메소드 x)
        int[] ints = new int[3];
        System.out.println(ints[0]); // 0

        double[] doubles = new double[3];
        System.out.println(doubles[0]); // 0.0

        // 참조 자료형 (대문자로 시작, 메소드 O)
        String[] strings = new String[3];
        System.out.println(strings[0]); // null

        Camera[] cameras = new Camera[3];
        System.out.println(cameras[0] == null); // true

        // 기본자료형 - 복사
        int a = 10;
        int b = 20;

        b = a;
        System.out.println(a); // 10
        System.out.println(b); // 10

        b = 30;

        System.out.println(a); // 10
        System.out.println(b); // 30

        // 참조 자료형 - 참조
        Camera camera1 = new Camera();
        Camera camera2 = new Camera();

        camera1.name = "카메라1";
        camera2.name = "카메라2";

        System.out.println(camera1.name); // 카메라1
        System.out.println(camera2.name); // 카메라2

        camera2 = camera1;

        System.out.println(camera1.name); // 카메라1
        System.out.println(camera2.name); // 카메라1

        camera2.name = "고장난 카메라";

        System.out.println(camera1.name); // 고장난 카메라
        System.out.println(camera2.name); // 고장난 카메라

        changeName(camera2);

        System.out.println(camera1.name); // 잘못된 카메라
        System.out.println(camera2.name); // 잘못된 카메라

        camera2 = null;

        System.out.println(camera1.name);
        System.out.println(camera2);
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }

}
