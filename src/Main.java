import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {;
    }

    static void method() {
        int[] messiv = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        for (int i = 0; i < messiv.length; i++) {
            if (messiv[i] % 2 == 0) {
                System.out.println(messiv[i]);
            }

        }
    }

    static void method2() {
        int[] massiv = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0) {
                System.out.println(massiv[i] + "tak san");
            }
        }
    }

    static void hello() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Hello");

        } else if (a == 2) {
            System.out.println("Bye");
        }

    }

    static void jadebal() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d*%d=%d\t", j, i, i * j);

            }
            System.out.println();

        }
    }





    static void method(int @NotNull [] array){
        String []mass={"Java","JS","Python"};
        int []iMass={1,2,3,4,5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}










