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

class Car {

    private String modelName;

    private int modelYear;

    private String color;

    private int maxSpeed;

    private int currentSpeed;



    Car(String modelName, int modelYear, String color, int maxSpeed) {

        this.modelName = modelName;

        this.modelYear = modelYear;

        this.color = color;

        this.maxSpeed = maxSpeed;

        this.currentSpeed = 0;

    }



    Car() {

        this("소나타", 2012, "검정색", 160); // 다른 생성자를 호출함.

    }



    public String getModel() {

        return this.modelYear + "년식 " + this.modelName + " " + this.color;

    }

}



 class method {

    public static void main(String[] args) {

        Car tcpCar = new Car(); System.out.println(tcpCar.getModel());

    }

}

class Field {

    static int classVar = 10; // 클래스 변수 선언

    int instanceVar = 20;     // 인스턴스 변수 선언

}



class Member01 {

    public static void main(String[] args) {

        int var = 30;                   // 지역 변수 선언

        System.out.println(var + "\n"); // 지역 변수 참조



        Field myField1 = new Field();   // 인스턴스 생성

        Field myField2 = new Field();   // 인스턴스 생성



        System.out.println(Field.classVar); // 클래스 변수 참조

        System.out.println(myField1.classVar);

        System.out.println(myField2.classVar + "\n");



        myField1.classVar = 100;            // 클래스 변수의 값을 변경



        System.out.println(Field.classVar); // 클래스 변수 참조

        System.out.println(myField1.classVar);

        System.out.println(myField2.classVar + "\n");



        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조

        System.out.println(myField2.instanceVar + "\n");



        myField1.instanceVar = 400;               // 인스턴스 변수의 값을 변경



        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조

        System.out.println(myField2.instanceVar);

    }

}
class Method {

    int a = 50, b = 20;                            // 인스턴스 변수

    int add() { return a + b; }                    // 인스턴스 메소드

    static int add(int x, int y) { return x + y; } // 클래스 메소드

}



class Member02 {

    public static void main(String[] args) {

        System.out.println(Method.add(20, 30)); // 클래스 메소드의 호출

        Method myMethod = new Method();         // 인스턴스 생성

        System.out.println(myMethod.add());     // 인스턴스 메소드의 호출

    }

}
class InitBlock {

    static int classVar = 10;         // 클래스 변수의 명시적 초기화

    int instanceVar = 10;             // 인스턴스 변수의 명시적 초기화

    static { classVar = 20; }         // 클래스 초기화 블록을 이용한 초기화

    { instanceVar = 20; }             // 인스턴스 초기화 블록을 이용한 초기화

    InitBlock() { instanceVar = 30; } // 생성자를 이용한 초기화

}



class Member05 {

    public static void main(String[] args) {

        System.out.println(InitBlock.classVar);

        InitBlock myInit = new InitBlock();

        System.out.println(myInit.instanceVar);

    }

}

class Parent {

    int a;

    Parent() { a = 10; }

    Parent(int n) { a = n; }

}



class Child extends Parent {

    int b;

    Child() {

      //super(40);

        b = 20;

    }

    void display() {

        System.out.println(a);

        System.out.println(b);

    }

}



 class Inheritance04 {

    public static void main(String[] args) {

        Child ch = new Child();

        ch.display();

    }

}

class Parent1 { }

class Child1 extends Parent { }

class Brother extends Parent { }



 class Polymorphism01 {

    public static void main(String[] args) {

        Parent1 p = new Parent1();

        System.out.println(p instanceof Object); // true

        System.out.println(p instanceof Parent1); // true

//        System.out.println(p instanceof Child1);  // false

        System.out.println();



        Parent c = new Child1();

        System.out.println(c instanceof Object); // true

        System.out.println(c instanceof Parent); // true

        System.out.println(c instanceof Child1);  // true

    }

}

interface Animal { public abstract void cry(); }

interface Pet { public abstract void play(); }



class Cat implements Animal, Pet {

    public void cry() {

        System.out.println("냐옹냐옹!");

    }

    public void play() {

        System.out.println("쥐 잡기 놀이하자~!");

    }

}



class Dog implements Animal, Pet {

    public void cry() {

        System.out.println("멍멍!");

    }

    public void play() {

        System.out.println("산책가자~!");

    }

}



class Polymorphism04 {

    public static void main(String[] args) {

        Cat c = new Cat();

        Dog d = new Dog();



        c.cry();

        c.play();

        d.cry();

        d.play();

    }

}