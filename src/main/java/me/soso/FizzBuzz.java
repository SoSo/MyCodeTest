package me.soso;

public class FizzBuzz {

    private static void sout(int number, boolean isFizz, boolean isBuzz) {
        if (isFizz && isBuzz) {
            System.out.println("FizzBuzz");
        } else if (isFizz) {
            System.out.println("Fizz");
        } else if (isBuzz) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }

    private static boolean isInclude(int number, int includeNumber) {
        int temp;
        while (number > 0) {
            temp = number % 10;
            number /= 10;
            if (temp == includeNumber) return true;
        }
        return false;
    }

    public static void stage1() {
        System.out.println("------------------stage1 begin------------------");
        for (int i = 1; i < 101; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            sout(i, isFizz, isBuzz);
        }
        System.out.println("------------------stage1 end------------------");
    }

    public static void stage2() {
        System.out.println("------------------stage2 begin------------------");
        for (int i = 1; i < 101; i++) {
            boolean isFizz = i % 3 == 0 || isInclude(i, 3);
            boolean isBuzz = i % 5 == 0 || isInclude(i, 5);
            sout(i, isFizz, isBuzz);
        }
        System.out.println("------------------stage2 end------------------");
    }
}
