import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            int[] grade1 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성

            int[] grade2 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성



            grade1[0] = 85; // 인덱스를 이용한 배열의 초기화

            grade1[1] = 65;

            grade1[2] = 90;



            grade2[0] = 85; // 배열의 길이보다 적은 수의 배열 요소만 초기화


            for (int value : grade1) {

                System.out.print(value + " "); // 인덱스를 이용한 배열로의 접근

            }



            for (int i = 0; i < grade2.length; i++) {

                System.out.println(grade2[i] + " "); // 인덱스를 이용한 배열로의 접근

            }
            int[][] arr = new int[2][3];



            int k = 10;

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length; j++) {

                    arr[i][j] = k; // 인덱스를 이용한 초기화

                    k += 10;

                }

            }



            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length; j++) {

                    System.out.print(arr[i][j] + " ");

                }

                System.out.println();

            }

            int[] arr1 = new int[]{1, 2, 3, 4, 5};
            int newLen = 10;

            // 1. System 클래스의 arraycopy() 메소드
            int[] arr2 = new int[newLen];
            System.arraycopy(arr1, 0, arr2, 0, arr1.length);

            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
            System.out.println();

            // 2. Arrays 클래스의 copyOf() 메소드
            int[] arr3 = Arrays.copyOf(arr1, 10);

            for (int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i] + " ");
            }
            System.out.println();

            // 3. Object 클래스의 clone() 메소드
            int[] arr4 = arr1.clone();

            for (int i = 0; i < arr4.length; i++) {
                System.out.print(arr4[i] + " ");
            }
            System.out.println();

            // 4. for 문과 인덱스를 이용한 복사
            int[] arr5 = new int[newLen];

            for (int i = 0; i < arr1.length; i++) {
                arr5[i] = arr1[i];
            }

            for (int i = 0; i < arr5.length; i++) {
                System.out.print(arr5[i] + " ");
            }

        }

    class Car {                    // 클래스 이름

        private String modelName;  // 필드

        private int modelYear;     // 필드
        private int color;


        Car(String modelName, int modelYear) { // 생성자

            this.modelName = modelName;

            this.modelYear = modelYear;

        }



        public String getModel() { // 메소드

            return this.modelYear + "년식 " + this.modelName + " " + this.color;

        }

    }


    }
